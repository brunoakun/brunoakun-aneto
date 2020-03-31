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

public class acformula02 extends Activity implements B4AActivity{
	public static acformula02 mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "anetocalcV4.cerolab", "anetocalcV4.cerolab.acformula02");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (acformula02).");
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
		activityBA = new BA(this, layout, processBA, "anetocalcV4.cerolab", "anetocalcV4.cerolab.acformula02");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "anetocalcV4.cerolab.acformula02", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (acformula02) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (acformula02) Resume **");
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
		return acformula02.class;
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
        BA.LogInfo("** Activity (acformula02) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            acformula02 mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (acformula02) Resume **");
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
public anywheresoftware.b4a.objects.LabelWrapper _lbresult = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbtitulo = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public anetocalcV4.cerolab.main _main = null;
public anetocalcV4.cerolab.starter _starter = null;
public anetocalcV4.cerolab.acformula01 _acformula01 = null;
public anetocalcV4.cerolab.acformula03 _acformula03 = null;
public anetocalcV4.cerolab.formulas _formulas = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="acformula02";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="Activity.LoadLayout(\"LyFormula02\")";
mostCurrent._activity.LoadLayout("LyFormula02",mostCurrent.activityBA);
RDebugUtils.currentLine=2293764;
 //BA.debugLineNum = 2293764;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="acformula02";
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="Log(\"Formula02 Activity_Pause\")";
anywheresoftware.b4a.keywords.Common.LogImpl("22555905","Formula02 Activity_Pause",0);
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="acformula02";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="Log(\"Formula02 Activity_Resume\")";
anywheresoftware.b4a.keywords.Common.LogImpl("22490369","Formula02 Activity_Resume",0);
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="End Sub";
return "";
}
public static String  _clacula01() throws Exception{
RDebugUtils.currentModule="acformula02";
if (Debug.shouldDelegate(mostCurrent.activityBA, "clacula01", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "clacula01", null));}
float _cal = 0f;
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Sub clacula01 As String";
RDebugUtils.currentLine=2621443;
 //BA.debugLineNum = 2621443;BA.debugLine="Dim cal As Float";
_cal = 0f;
RDebugUtils.currentLine=2621446;
 //BA.debugLineNum = 2621446;BA.debugLine="If B > 9999 Then";
if (_b>9999) { 
RDebugUtils.currentLine=2621447;
 //BA.debugLineNum = 2621447;BA.debugLine="B=9999";
_b = (float) (9999);
RDebugUtils.currentLine=2621448;
 //BA.debugLineNum = 2621448;BA.debugLine="EtB.Text=B";
mostCurrent._etb.setText(BA.ObjectToCharSequence(_b));
 };
RDebugUtils.currentLine=2621451;
 //BA.debugLineNum = 2621451;BA.debugLine="If A=0 And B=0 And C=0 Then";
if (_a==0 && _b==0 && _c==0) { 
RDebugUtils.currentLine=2621452;
 //BA.debugLineNum = 2621452;BA.debugLine="Return(0)";
if (true) return BA.NumberToString((0));
 };
RDebugUtils.currentLine=2621456;
 //BA.debugLineNum = 2621456;BA.debugLine="cal=(A/(3*0.92*B)*100)";
_cal = (float) ((_a/(double)(3*0.92*_b)*100));
RDebugUtils.currentLine=2621457;
 //BA.debugLineNum = 2621457;BA.debugLine="Log(\"calculo=\" &  cal)";
anywheresoftware.b4a.keywords.Common.LogImpl("22621457","calculo="+BA.NumberToString(_cal),0);
RDebugUtils.currentLine=2621459;
 //BA.debugLineNum = 2621459;BA.debugLine="If cal=\"-Infinity\" Or cal=\"Infinity\" Then";
if (_cal==(double)(Double.parseDouble("-Infinity")) || _cal==(double)(Double.parseDouble("Infinity"))) { 
RDebugUtils.currentLine=2621460;
 //BA.debugLineNum = 2621460;BA.debugLine="Return(\"0\")";
if (true) return ("0");
 };
RDebugUtils.currentLine=2621463;
 //BA.debugLineNum = 2621463;BA.debugLine="Return(NumberFormat (cal,0,2))";
if (true) return (anywheresoftware.b4a.keywords.Common.NumberFormat(_cal,(int) (0),(int) (2)));
RDebugUtils.currentLine=2621464;
 //BA.debugLineNum = 2621464;BA.debugLine="End Sub";
return "";
}
public static String  _eta_focuschanged(boolean _hasfocus) throws Exception{
RDebugUtils.currentModule="acformula02";
if (Debug.shouldDelegate(mostCurrent.activityBA, "eta_focuschanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "eta_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Sub EtA_FocusChanged (HasFocus As Boolean)";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="If HasFocus Then EtA.Text=\"\"";
if (_hasfocus) { 
mostCurrent._eta.setText(BA.ObjectToCharSequence(""));};
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="End Sub";
return "";
}
public static String  _eta_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="acformula02";
if (Debug.shouldDelegate(mostCurrent.activityBA, "eta_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "eta_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Sub EtA_TextChanged (Old As String, New As String)";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="If New = \"\" Or New=\".\" Then";
if ((_new).equals("") || (_new).equals(".")) { 
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="A=0";
_a = (float) (0);
 }else {
RDebugUtils.currentLine=2359300;
 //BA.debugLineNum = 2359300;BA.debugLine="A=New";
_a = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=2359302;
 //BA.debugLineNum = 2359302;BA.debugLine="LbResult.Text = clacula01";
mostCurrent._lbresult.setText(BA.ObjectToCharSequence(_clacula01()));
RDebugUtils.currentLine=2359303;
 //BA.debugLineNum = 2359303;BA.debugLine="End Sub";
return "";
}
public static String  _etb_focuschanged(boolean _hasfocus) throws Exception{
RDebugUtils.currentModule="acformula02";
if (Debug.shouldDelegate(mostCurrent.activityBA, "etb_focuschanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "etb_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Sub EtB_FocusChanged (HasFocus As Boolean)";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="If HasFocus Then EtB.Text=\"\"";
if (_hasfocus) { 
mostCurrent._etb.setText(BA.ObjectToCharSequence(""));};
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="End Sub";
return "";
}
public static String  _etb_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="acformula02";
if (Debug.shouldDelegate(mostCurrent.activityBA, "etb_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "etb_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Sub EtB_TextChanged (Old As String, New As String)";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="If New = \"\" Or New=\".\" Then";
if ((_new).equals("") || (_new).equals(".")) { 
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="B=0";
_b = (float) (0);
 }else {
RDebugUtils.currentLine=2424836;
 //BA.debugLineNum = 2424836;BA.debugLine="B=New";
_b = (float)(Double.parseDouble(_new));
 };
RDebugUtils.currentLine=2424838;
 //BA.debugLineNum = 2424838;BA.debugLine="LbResult.Text = clacula01";
mostCurrent._lbresult.setText(BA.ObjectToCharSequence(_clacula01()));
RDebugUtils.currentLine=2424839;
 //BA.debugLineNum = 2424839;BA.debugLine="End Sub";
return "";
}
}