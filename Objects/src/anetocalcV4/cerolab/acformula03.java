package anetocalcV4.cerolab;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class acformula03 extends Activity implements B4AActivity{
	public static acformula03 mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = false;
    public static WeakReference<Activity> previousOne;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "anetocalcV4.cerolab", "anetocalcV4.cerolab.acformula03");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (acformula03).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(this, processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "anetocalcV4.cerolab", "anetocalcV4.cerolab.acformula03");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "anetocalcV4.cerolab.acformula03", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (acformula03) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (acformula03) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return acformula03.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        BA.LogInfo("** Activity (acformula03) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        processBA.setActivityPaused(true);
        mostCurrent = null;
        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
            acformula03 mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (acformula03) Resume **");
            if (mc != mostCurrent)
                return;
		    processBA.raiseEvent(mc._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }



public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public anywheresoftware.b4a.keywords.Common __c = null;
public static float _a = 0f;
public static float _b = 0f;
public static float _c = 0f;
public static float _d = 0f;
public static float _e = 0f;
public static float _f = 0f;
public static float _g = 0f;
public anywheresoftware.b4a.objects.EditTextWrapper _eta = null;
public anywheresoftware.b4a.objects.EditTextWrapper _etb = null;
public anywheresoftware.b4a.objects.EditTextWrapper _etc = null;
public anywheresoftware.b4a.objects.EditTextWrapper _etd = null;
public anywheresoftware.b4a.objects.EditTextWrapper _ete = null;
public anywheresoftware.b4a.objects.EditTextWrapper _etf = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbresultpalet = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbresult = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public anetocalcV4.cerolab.main _main = null;
public anetocalcV4.cerolab.starter _starter = null;
public anetocalcV4.cerolab.acformula01 _acformula01 = null;
public anetocalcV4.cerolab.acformula02 _acformula02 = null;
public anetocalcV4.cerolab.formulas _formulas = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="acformula03";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=2949123;
 //BA.debugLineNum = 2949123;BA.debugLine="Activity.LoadLayout(\"LyFormula03\")";
mostCurrent._activity.LoadLayout("LyFormula03",mostCurrent.activityBA);
RDebugUtils.currentLine=2949124;
 //BA.debugLineNum = 2949124;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="acformula03";
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=3473409;
 //BA.debugLineNum = 3473409;BA.debugLine="Log(\"Formula03 Activity_Pause\")";
anywheresoftware.b4a.keywords.Common.LogImpl("23473409","Formula03 Activity_Pause",0);
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="acformula03";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="Log(\"Formula03 Activity_Resume\")";
anywheresoftware.b4a.keywords.Common.LogImpl("23407873","Formula03 Activity_Resume",0);
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="End Sub";
return "";
}
public static String  _clacula01() throws Exception{
RDebugUtils.currentModule="acformula03";
if (Debug.shouldDelegate(mostCurrent.activityBA, "clacula01", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "clacula01", null));}
float _cal = 0f;
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Sub clacula01 As String";
RDebugUtils.currentLine=3538949;
 //BA.debugLineNum = 3538949;BA.debugLine="Dim cal As Float";
_cal = 0f;
RDebugUtils.currentLine=3538952;
 //BA.debugLineNum = 3538952;BA.debugLine="If B > 9999 Then";
if (_b>9999) { 
RDebugUtils.currentLine=3538953;
 //BA.debugLineNum = 3538953;BA.debugLine="B=9999";
_b = (float) (9999);
RDebugUtils.currentLine=3538954;
 //BA.debugLineNum = 3538954;BA.debugLine="EtB.Text=B";
mostCurrent._etb.setText(BA.ObjectToCharSequence(_b));
 };
RDebugUtils.currentLine=3538957;
 //BA.debugLineNum = 3538957;BA.debugLine="If A=0 And B=0 Then";
if (_a==0 && _b==0) { 
RDebugUtils.currentLine=3538958;
 //BA.debugLineNum = 3538958;BA.debugLine="Return(0)";
if (true) return BA.NumberToString((0));
 };
RDebugUtils.currentLine=3538962;
 //BA.debugLineNum = 3538962;BA.debugLine="LbResultPalet.Text = claculaG";
mostCurrent._lbresultpalet.setText(BA.ObjectToCharSequence(_claculag()));
RDebugUtils.currentLine=3538964;
 //BA.debugLineNum = 3538964;BA.debugLine="Log(\"VALORES: A=\"&A&\"B=\"&B&\"C=\"&C&\"D=\"&D&\"E=\"&E&\"";
anywheresoftware.b4a.keywords.Common.LogImpl("23538964","VALORES: A="+BA.NumberToString(_a)+"B="+BA.NumberToString(_b)+"C="+BA.NumberToString(_c)+"D="+BA.NumberToString(_d)+"E="+BA.NumberToString(_e)+"F="+BA.NumberToString(_f)+"G="+BA.NumberToString(_g),0);
RDebugUtils.currentLine=3538966;
 //BA.debugLineNum = 3538966;BA.debugLine="If E=0 Then Return(\"0.00\")	' Evitar dividir x 0";
if (_e==0) { 
if (true) return ("0.00");};
RDebugUtils.currentLine=3538968;
 //BA.debugLineNum = 3538968;BA.debugLine="cal=(((G*C*D*F*0.92)/E)-1)*100";
_cal = (float) ((((_g*_c*_d*_f*0.92)/(double)_e)-1)*100);
RDebugUtils.currentLine=3538969;
 //BA.debugLineNum = 3538969;BA.debugLine="cal=cal+0";
_cal = (float) (_cal+0);
RDebugUtils.currentLine=3538970;
 //BA.debugLineNum = 3538970;BA.debugLine="Log(\"calculo=\" & cal)";
anywheresoftware.b4a.keywords.Common.LogImpl("23538970","calculo="+BA.NumberToString(_cal),0);
RDebugUtils.currentLine=3538972;
 //BA.debugLineNum = 3538972;BA.debugLine="If cal=\"-Infinity\" Or cal=\"Infinity\" Then";
if (_cal==(double)(Double.parseDouble("-Infinity")) || _cal==(double)(Double.parseDouble("Infinity"))) { 
RDebugUtils.currentLine=3538973;
 //BA.debugLineNum = 3538973;BA.debugLine="Return(\"0.00\")";
if (true) return ("0.00");
 };
RDebugUtils.currentLine=3538976;
 //BA.debugLineNum = 3538976;BA.debugLine="Return(NumberFormat2(cal,1,2,2,True))";
if (true) return (anywheresoftware.b4a.keywords.Common.NumberFormat2(_cal,(int) (1),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.True));
RDebugUtils.currentLine=3538977;
 //BA.debugLineNum = 3538977;BA.debugLine="End Sub";
return "";
}
public static String  _claculag() throws Exception{
RDebugUtils.currentModule="acformula03";
if (Debug.shouldDelegate(mostCurrent.activityBA, "claculag", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "claculag", null));}
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Sub claculaG As String";
RDebugUtils.currentLine=3604481;
 //BA.debugLineNum = 3604481;BA.debugLine="G=((A/100)+(B/100))*2";
_g = (float) (((_a/(double)100)+(_b/(double)100))*2);
RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="If IsNumber(G)=False Or G=\"-Infinity\" Or G=\"Infin";
if (anywheresoftware.b4a.keywords.Common.IsNumber(BA.NumberToString(_g))==anywheresoftware.b4a.keywords.Common.False || _g==(double)(Double.parseDouble("-Infinity")) || _g==(double)(Double.parseDouble("Infinity"))) { 
RDebugUtils.currentLine=3604483;
 //BA.debugLineNum = 3604483;BA.debugLine="Return(\"0\")";
if (true) return ("0");
 };
RDebugUtils.currentLine=3604486;
 //BA.debugLineNum = 3604486;BA.debugLine="Return(NumberFormat2(G,1,1,1,True))";
if (true) return (anywheresoftware.b4a.keywords.Common.NumberFormat2(_g,(int) (1),(int) (1),(int) (1),anywheresoftware.b4a.keywords.Common.True));
RDebugUtils.currentLine=3604487;
 //BA.debugLineNum = 3604487;BA.debugLine="End Sub";
return "";
}
public static String  _eta_focuschanged(boolean _hasfocus) throws Exception{
RDebugUtils.currentModule="acformula03";
if (Debug.shouldDelegate(mostCurrent.activityBA, "eta_focuschanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "eta_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=3670016;
 //BA.debugLineNum = 3670016;BA.debugLine="Sub EtA_FocusChanged (HasFocus As Boolean)";
RDebugUtils.currentLine=3670017;
 //BA.debugLineNum = 3670017;BA.debugLine="If HasFocus Then EtA.Text=\"\"";
if (_hasfocus) { 
mostCurrent._eta.setText(BA.ObjectToCharSequence(""));};
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="End Sub";
return "";
}
public static String  _eta_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="acformula03";
if (Debug.shouldDelegate(mostCurrent.activityBA, "eta_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "eta_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Sub EtA_TextChanged (Old As String, New As String)";
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="If New = \"\" Or New=\".\" Then";
if ((_new).equals("") || (_new).equals(".")) { 
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="A=0";
_a = (float) (0);
 }else {
RDebugUtils.currentLine=3014660;
 //BA.debugLineNum = 3014660;BA.debugLine="A=New";
_a = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=3014662;
 //BA.debugLineNum = 3014662;BA.debugLine="LbResult.Text = clacula01";
mostCurrent._lbresult.setText(BA.ObjectToCharSequence(_clacula01()));
RDebugUtils.currentLine=3014663;
 //BA.debugLineNum = 3014663;BA.debugLine="End Sub";
return "";
}
public static String  _etb_focuschanged(boolean _hasfocus) throws Exception{
RDebugUtils.currentModule="acformula03";
if (Debug.shouldDelegate(mostCurrent.activityBA, "etb_focuschanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "etb_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="Sub EtB_FocusChanged (HasFocus As Boolean)";
RDebugUtils.currentLine=3735553;
 //BA.debugLineNum = 3735553;BA.debugLine="If HasFocus Then EtB.Text=\"\"";
if (_hasfocus) { 
mostCurrent._etb.setText(BA.ObjectToCharSequence(""));};
RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="End Sub";
return "";
}
public static String  _etb_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="acformula03";
if (Debug.shouldDelegate(mostCurrent.activityBA, "etb_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "etb_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Sub EtB_TextChanged (Old As String, New As String)";
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="If New = \"\" Or New=\".\" Then";
if ((_new).equals("") || (_new).equals(".")) { 
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="B=0";
_b = (float) (0);
 }else {
RDebugUtils.currentLine=3080196;
 //BA.debugLineNum = 3080196;BA.debugLine="B=New";
_b = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=3080198;
 //BA.debugLineNum = 3080198;BA.debugLine="LbResult.Text = clacula01";
mostCurrent._lbresult.setText(BA.ObjectToCharSequence(_clacula01()));
RDebugUtils.currentLine=3080199;
 //BA.debugLineNum = 3080199;BA.debugLine="End Sub";
return "";
}
public static String  _etc_focuschanged(boolean _hasfocus) throws Exception{
RDebugUtils.currentModule="acformula03";
if (Debug.shouldDelegate(mostCurrent.activityBA, "etc_focuschanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "etc_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Sub EtC_FocusChanged (HasFocus As Boolean)";
RDebugUtils.currentLine=3801089;
 //BA.debugLineNum = 3801089;BA.debugLine="If HasFocus Then EtC.Text=\"\"";
if (_hasfocus) { 
mostCurrent._etc.setText(BA.ObjectToCharSequence(""));};
RDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="End Sub";
return "";
}
public static String  _etc_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="acformula03";
if (Debug.shouldDelegate(mostCurrent.activityBA, "etc_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "etc_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Sub EtC_TextChanged (Old As String, New As String)";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="If New = \"\" Or New=\".\" Then";
if ((_new).equals("") || (_new).equals(".")) { 
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="C=0";
_c = (float) (0);
 }else {
RDebugUtils.currentLine=3145732;
 //BA.debugLineNum = 3145732;BA.debugLine="C=New";
_c = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=3145734;
 //BA.debugLineNum = 3145734;BA.debugLine="LbResult.Text = clacula01";
mostCurrent._lbresult.setText(BA.ObjectToCharSequence(_clacula01()));
RDebugUtils.currentLine=3145735;
 //BA.debugLineNum = 3145735;BA.debugLine="End Sub";
return "";
}
public static String  _etd_focuschanged(boolean _hasfocus) throws Exception{
RDebugUtils.currentModule="acformula03";
if (Debug.shouldDelegate(mostCurrent.activityBA, "etd_focuschanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "etd_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Sub EtD_FocusChanged (HasFocus As Boolean)";
RDebugUtils.currentLine=3866625;
 //BA.debugLineNum = 3866625;BA.debugLine="If HasFocus Then EtD.Text=\"\"";
if (_hasfocus) { 
mostCurrent._etd.setText(BA.ObjectToCharSequence(""));};
RDebugUtils.currentLine=3866626;
 //BA.debugLineNum = 3866626;BA.debugLine="End Sub";
return "";
}
public static String  _etd_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="acformula03";
if (Debug.shouldDelegate(mostCurrent.activityBA, "etd_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "etd_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Sub EtD_TextChanged (Old As String, New As String)";
RDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="If New = \"\" Or New=\".\" Then";
if ((_new).equals("") || (_new).equals(".")) { 
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="D=0";
_d = (float) (0);
 }else {
RDebugUtils.currentLine=3211268;
 //BA.debugLineNum = 3211268;BA.debugLine="D=New";
_d = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=3211270;
 //BA.debugLineNum = 3211270;BA.debugLine="LbResult.Text = clacula01";
mostCurrent._lbresult.setText(BA.ObjectToCharSequence(_clacula01()));
RDebugUtils.currentLine=3211271;
 //BA.debugLineNum = 3211271;BA.debugLine="End Sub";
return "";
}
public static String  _ete_focuschanged(boolean _hasfocus) throws Exception{
RDebugUtils.currentModule="acformula03";
if (Debug.shouldDelegate(mostCurrent.activityBA, "ete_focuschanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "ete_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Sub EtE_FocusChanged (HasFocus As Boolean)";
RDebugUtils.currentLine=3932161;
 //BA.debugLineNum = 3932161;BA.debugLine="If HasFocus Then EtE.Text=\"\"";
if (_hasfocus) { 
mostCurrent._ete.setText(BA.ObjectToCharSequence(""));};
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="End Sub";
return "";
}
public static String  _ete_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="acformula03";
if (Debug.shouldDelegate(mostCurrent.activityBA, "ete_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "ete_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Sub EtE_TextChanged (Old As String, New As String)";
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="If New = \"\" Or New=\".\" Then";
if ((_new).equals("") || (_new).equals(".")) { 
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="E=0";
_e = (float) (0);
 }else {
RDebugUtils.currentLine=3276804;
 //BA.debugLineNum = 3276804;BA.debugLine="E=New";
_e = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=3276806;
 //BA.debugLineNum = 3276806;BA.debugLine="LbResult.Text = clacula01";
mostCurrent._lbresult.setText(BA.ObjectToCharSequence(_clacula01()));
RDebugUtils.currentLine=3276807;
 //BA.debugLineNum = 3276807;BA.debugLine="End Sub";
return "";
}
public static String  _etf_focuschanged(boolean _hasfocus) throws Exception{
RDebugUtils.currentModule="acformula03";
if (Debug.shouldDelegate(mostCurrent.activityBA, "etf_focuschanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "etf_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Sub EtF_FocusChanged (HasFocus As Boolean)";
RDebugUtils.currentLine=3997697;
 //BA.debugLineNum = 3997697;BA.debugLine="If HasFocus Then EtF.Text=\"\"";
if (_hasfocus) { 
mostCurrent._etf.setText(BA.ObjectToCharSequence(""));};
RDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="End Sub";
return "";
}
public static String  _etf_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="acformula03";
if (Debug.shouldDelegate(mostCurrent.activityBA, "etf_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "etf_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Sub EtF_TextChanged (Old As String, New As String)";
RDebugUtils.currentLine=3342337;
 //BA.debugLineNum = 3342337;BA.debugLine="If New = \"\" Or New=\".\" Then";
if ((_new).equals("") || (_new).equals(".")) { 
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="F=0";
_f = (float) (0);
 }else {
RDebugUtils.currentLine=3342340;
 //BA.debugLineNum = 3342340;BA.debugLine="F=New";
_f = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=3342342;
 //BA.debugLineNum = 3342342;BA.debugLine="LbResult.Text = clacula01";
mostCurrent._lbresult.setText(BA.ObjectToCharSequence(_clacula01()));
RDebugUtils.currentLine=3342343;
 //BA.debugLineNum = 3342343;BA.debugLine="End Sub";
return "";
}
}