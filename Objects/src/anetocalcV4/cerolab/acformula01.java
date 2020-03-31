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

public class acformula01 extends Activity implements B4AActivity{
	public static acformula01 mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "anetocalcV4.cerolab", "anetocalcV4.cerolab.acformula01");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (acformula01).");
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
		activityBA = new BA(this, layout, processBA, "anetocalcV4.cerolab", "anetocalcV4.cerolab.acformula01");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "anetocalcV4.cerolab.acformula01", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (acformula01) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (acformula01) Resume **");
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
		return acformula01.class;
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
        BA.LogInfo("** Activity (acformula01) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            acformula01 mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (acformula01) Resume **");
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
public anywheresoftware.b4a.objects.EditTextWrapper _eta = null;
public anywheresoftware.b4a.objects.EditTextWrapper _etb = null;
public anywheresoftware.b4a.objects.EditTextWrapper _etc = null;
public anywheresoftware.b4a.objects.EditTextWrapper _etd = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbresult = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbtitulo = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public anetocalcV4.cerolab.main _main = null;
public anetocalcV4.cerolab.starter _starter = null;
public anetocalcV4.cerolab.acformula02 _acformula02 = null;
public anetocalcV4.cerolab.acformula03 _acformula03 = null;
public anetocalcV4.cerolab.formulas _formulas = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="acformula01";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="Activity.LoadLayout(\"LyFormula01\")";
mostCurrent._activity.LoadLayout("LyFormula01",mostCurrent.activityBA);
RDebugUtils.currentLine=1310724;
 //BA.debugLineNum = 1310724;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="acformula01";
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="Log(\"Formula01 Activity_Pause\")";
anywheresoftware.b4a.keywords.Common.LogImpl("21769473","Formula01 Activity_Pause",0);
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="acformula01";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="Log(\"Formula01 Activity_Resume\")";
anywheresoftware.b4a.keywords.Common.LogImpl("21703937","Formula01 Activity_Resume",0);
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="End Sub";
return "";
}
public static String  _btsalir_click() throws Exception{
RDebugUtils.currentModule="acformula01";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btsalir_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btsalir_click", null));}
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Sub BtSalir_Click";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="StartActivity(\"Main\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("Main"));
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="End Sub";
return "";
}
public static String  _clacula01() throws Exception{
RDebugUtils.currentModule="acformula01";
if (Debug.shouldDelegate(mostCurrent.activityBA, "clacula01", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "clacula01", null));}
float _cal = 0f;
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Sub clacula01 As String";
RDebugUtils.currentLine=1835011;
 //BA.debugLineNum = 1835011;BA.debugLine="Dim cal As Float";
_cal = 0f;
RDebugUtils.currentLine=1835014;
 //BA.debugLineNum = 1835014;BA.debugLine="If B > 9999 Then";
if (_b>9999) { 
RDebugUtils.currentLine=1835015;
 //BA.debugLineNum = 1835015;BA.debugLine="B=9999";
_b = (float) (9999);
RDebugUtils.currentLine=1835016;
 //BA.debugLineNum = 1835016;BA.debugLine="EtB.Text=B";
mostCurrent._etb.setText(BA.ObjectToCharSequence(_b));
 };
RDebugUtils.currentLine=1835019;
 //BA.debugLineNum = 1835019;BA.debugLine="If C > 9999 Then";
if (_c>9999) { 
RDebugUtils.currentLine=1835020;
 //BA.debugLineNum = 1835020;BA.debugLine="C=9999";
_c = (float) (9999);
RDebugUtils.currentLine=1835021;
 //BA.debugLineNum = 1835021;BA.debugLine="EtC.Text=C";
mostCurrent._etc.setText(BA.ObjectToCharSequence(_c));
 };
RDebugUtils.currentLine=1835024;
 //BA.debugLineNum = 1835024;BA.debugLine="If D=0 Then";
if (_d==0) { 
RDebugUtils.currentLine=1835025;
 //BA.debugLineNum = 1835025;BA.debugLine="Return(0)";
if (true) return BA.NumberToString((0));
 };
RDebugUtils.currentLine=1835028;
 //BA.debugLineNum = 1835028;BA.debugLine="If A=0 And B=0 And C=0 Then";
if (_a==0 && _b==0 && _c==0) { 
RDebugUtils.currentLine=1835029;
 //BA.debugLineNum = 1835029;BA.debugLine="Return(0)";
if (true) return BA.NumberToString((0));
 };
RDebugUtils.currentLine=1835033;
 //BA.debugLineNum = 1835033;BA.debugLine="cal=(B-C ) / (0.92*D*A)*1000";
_cal = (float) ((_b-_c)/(double)(0.92*_d*_a)*1000);
RDebugUtils.currentLine=1835034;
 //BA.debugLineNum = 1835034;BA.debugLine="Log(\"calcula01=\" &  cal)";
anywheresoftware.b4a.keywords.Common.LogImpl("21835034","calcula01="+BA.NumberToString(_cal),0);
RDebugUtils.currentLine=1835036;
 //BA.debugLineNum = 1835036;BA.debugLine="If cal=\"-Infinity\" Or cal=\"Infinity\" Then";
if (_cal==(double)(Double.parseDouble("-Infinity")) || _cal==(double)(Double.parseDouble("Infinity"))) { 
RDebugUtils.currentLine=1835037;
 //BA.debugLineNum = 1835037;BA.debugLine="Return(\"Error\")";
if (true) return ("Error");
 };
RDebugUtils.currentLine=1835040;
 //BA.debugLineNum = 1835040;BA.debugLine="Return(NumberFormat (cal,0,2))";
if (true) return (anywheresoftware.b4a.keywords.Common.NumberFormat(_cal,(int) (0),(int) (2)));
RDebugUtils.currentLine=1835041;
 //BA.debugLineNum = 1835041;BA.debugLine="End Sub";
return "";
}
public static String  _eta_focuschanged(boolean _hasfocus) throws Exception{
RDebugUtils.currentModule="acformula01";
if (Debug.shouldDelegate(mostCurrent.activityBA, "eta_focuschanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "eta_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Sub EtA_FocusChanged (HasFocus As Boolean)";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="If HasFocus Then EtA.Text=\"\"";
if (_hasfocus) { 
mostCurrent._eta.setText(BA.ObjectToCharSequence(""));};
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="End Sub";
return "";
}
public static String  _eta_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="acformula01";
if (Debug.shouldDelegate(mostCurrent.activityBA, "eta_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "eta_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Sub EtA_TextChanged (Old As String, New As String)";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="If New = \"\" Or New=\".\" Then";
if ((_new).equals("") || (_new).equals(".")) { 
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="A=0";
_a = (float) (0);
 }else {
RDebugUtils.currentLine=1441796;
 //BA.debugLineNum = 1441796;BA.debugLine="A=New";
_a = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=1441798;
 //BA.debugLineNum = 1441798;BA.debugLine="LbResult.Text = clacula01";
mostCurrent._lbresult.setText(BA.ObjectToCharSequence(_clacula01()));
RDebugUtils.currentLine=1441799;
 //BA.debugLineNum = 1441799;BA.debugLine="End Sub";
return "";
}
public static String  _etb_focuschanged(boolean _hasfocus) throws Exception{
RDebugUtils.currentModule="acformula01";
if (Debug.shouldDelegate(mostCurrent.activityBA, "etb_focuschanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "etb_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Sub EtB_FocusChanged (HasFocus As Boolean)";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="If HasFocus Then EtB.Text=\"\"";
if (_hasfocus) { 
mostCurrent._etb.setText(BA.ObjectToCharSequence(""));};
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="End Sub";
return "";
}
public static String  _etb_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="acformula01";
if (Debug.shouldDelegate(mostCurrent.activityBA, "etb_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "etb_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Sub EtB_TextChanged (Old As String, New As String)";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="If New = \"\" Or New=\".\" Then";
if ((_new).equals("") || (_new).equals(".")) { 
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="B=0";
_b = (float) (0);
 }else {
RDebugUtils.currentLine=1507332;
 //BA.debugLineNum = 1507332;BA.debugLine="B=New";
_b = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=1507334;
 //BA.debugLineNum = 1507334;BA.debugLine="LbResult.Text = clacula01";
mostCurrent._lbresult.setText(BA.ObjectToCharSequence(_clacula01()));
RDebugUtils.currentLine=1507335;
 //BA.debugLineNum = 1507335;BA.debugLine="End Sub";
return "";
}
public static String  _etc_focuschanged(boolean _hasfocus) throws Exception{
RDebugUtils.currentModule="acformula01";
if (Debug.shouldDelegate(mostCurrent.activityBA, "etc_focuschanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "etc_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Sub EtC_FocusChanged (HasFocus As Boolean)";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="If HasFocus Then EtC.Text=\"\"";
if (_hasfocus) { 
mostCurrent._etc.setText(BA.ObjectToCharSequence(""));};
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="End Sub";
return "";
}
public static String  _etc_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="acformula01";
if (Debug.shouldDelegate(mostCurrent.activityBA, "etc_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "etc_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Sub EtC_TextChanged (Old As String, New As String)";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="If New = \"\" Or New=\".\" Then";
if ((_new).equals("") || (_new).equals(".")) { 
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="C=0";
_c = (float) (0);
 }else {
RDebugUtils.currentLine=1572868;
 //BA.debugLineNum = 1572868;BA.debugLine="C=New";
_c = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=1572870;
 //BA.debugLineNum = 1572870;BA.debugLine="LbResult.Text = clacula01";
mostCurrent._lbresult.setText(BA.ObjectToCharSequence(_clacula01()));
RDebugUtils.currentLine=1572871;
 //BA.debugLineNum = 1572871;BA.debugLine="End Sub";
return "";
}
public static String  _etd_focuschanged(boolean _hasfocus) throws Exception{
RDebugUtils.currentModule="acformula01";
if (Debug.shouldDelegate(mostCurrent.activityBA, "etd_focuschanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "etd_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Sub EtD_FocusChanged (HasFocus As Boolean)";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="If HasFocus Then EtD.Text=\"\"";
if (_hasfocus) { 
mostCurrent._etd.setText(BA.ObjectToCharSequence(""));};
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="End Sub";
return "";
}
public static String  _etd_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="acformula01";
if (Debug.shouldDelegate(mostCurrent.activityBA, "etd_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "etd_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Sub EtD_TextChanged (Old As String, New As String)";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="If New = \"\" Or New=\".\" Then";
if ((_new).equals("") || (_new).equals(".")) { 
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="D=0";
_d = (float) (0);
 }else {
RDebugUtils.currentLine=1638404;
 //BA.debugLineNum = 1638404;BA.debugLine="D=New";
_d = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=1638406;
 //BA.debugLineNum = 1638406;BA.debugLine="LbResult.Text = clacula01";
mostCurrent._lbresult.setText(BA.ObjectToCharSequence(_clacula01()));
RDebugUtils.currentLine=1638407;
 //BA.debugLineNum = 1638407;BA.debugLine="End Sub";
return "";
}
}