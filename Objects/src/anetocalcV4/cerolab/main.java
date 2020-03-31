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

public class main extends Activity implements B4AActivity{
	public static main mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "anetocalcV4.cerolab", "anetocalcV4.cerolab.main");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (main).");
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
		activityBA = new BA(this, layout, processBA, "anetocalcV4.cerolab", "anetocalcV4.cerolab.main");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "anetocalcV4.cerolab.main", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (main) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (main) Resume **");
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
		return main.class;
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
        BA.LogInfo("** Activity (main) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            main mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (main) Resume **");
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
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        anywheresoftware.b4a.samples.httputils2.httputils2service._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}
public static boolean isAnyActivityVisible() {
    boolean vis = false;
vis = vis | (main.mostCurrent != null);
vis = vis | (acformula01.mostCurrent != null);
vis = vis | (acformula02.mostCurrent != null);
vis = vis | (acformula03.mostCurrent != null);
return vis;}

private static BA killProgramHelper(BA ba) {
    if (ba == null)
        return null;
    anywheresoftware.b4a.BA.SharedProcessBA sharedProcessBA = ba.sharedProcessBA;
    if (sharedProcessBA == null || sharedProcessBA.activityBA == null)
        return null;
    return sharedProcessBA.activityBA.get();
}
public static void killProgram() {
     {
            Activity __a = null;
            if (main.previousOne != null) {
				__a = main.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(main.mostCurrent == null ? null : main.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

BA.applicationContext.stopService(new android.content.Intent(BA.applicationContext, starter.class));
 {
            Activity __a = null;
            if (acformula01.previousOne != null) {
				__a = acformula01.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(acformula01.mostCurrent == null ? null : acformula01.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (acformula02.previousOne != null) {
				__a = acformula02.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(acformula02.mostCurrent == null ? null : acformula02.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (acformula03.previousOne != null) {
				__a = acformula03.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(acformula03.mostCurrent == null ? null : acformula03.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

}
public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public static String _usremail = "";
public static String _deviceid = "";
public anywheresoftware.b4a.objects.LabelWrapper _lbtitulo = null;
public anywheresoftware.b4a.objects.TabHostWrapper _tabhost1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btcontacto = null;
public anetocalcV4.cerolab.customlistview _clv1 = null;
public anetocalcV4.cerolab.customlistview _clv2 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _ivfoto = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbdescrip = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public anetocalcV4.cerolab.starter _starter = null;
public anetocalcV4.cerolab.acformula01 _acformula01 = null;
public anetocalcV4.cerolab.acformula02 _acformula02 = null;
public anetocalcV4.cerolab.acformula03 _acformula03 = null;
public anetocalcV4.cerolab.formulas _formulas = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
b4a.example.cl_dguid _uid = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _foto = null;
String _texto = "";
anywheresoftware.b4a.objects.collections.List _fotos = null;
anywheresoftware.b4a.objects.collections.List _textos = null;
int _f = 0;
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="Activity.LoadLayout(\"main\")";
mostCurrent._activity.LoadLayout("main",mostCurrent.activityBA);
RDebugUtils.currentLine=131075;
 //BA.debugLineNum = 131075;BA.debugLine="TabHost1.AddTab(\"CALCULADORA\", \"TabFormulas.bal\")";
mostCurrent._tabhost1.AddTab(mostCurrent.activityBA,"CALCULADORA","TabFormulas.bal");
RDebugUtils.currentLine=131076;
 //BA.debugLineNum = 131076;BA.debugLine="TabHost1.AddTab(\"PRODUCTOS\", \"TabProductos.bal\")";
mostCurrent._tabhost1.AddTab(mostCurrent.activityBA,"PRODUCTOS","TabProductos.bal");
RDebugUtils.currentLine=131081;
 //BA.debugLineNum = 131081;BA.debugLine="Dim uid As cl_dgUID";
_uid = new b4a.example.cl_dguid();
RDebugUtils.currentLine=131082;
 //BA.debugLineNum = 131082;BA.debugLine="uid.Initialize";
_uid._initialize(processBA);
RDebugUtils.currentLine=131083;
 //BA.debugLineNum = 131083;BA.debugLine="Log(\"-------------- dgUID lib test -------------\"";
anywheresoftware.b4a.keywords.Common.LogImpl("2131083","-------------- dgUID lib test -------------",0);
RDebugUtils.currentLine=131084;
 //BA.debugLineNum = 131084;BA.debugLine="Log(\"SDK: \"&uid.GetSDKInt)";
anywheresoftware.b4a.keywords.Common.LogImpl("2131084","SDK: "+BA.NumberToString(_uid._getsdkint()),0);
RDebugUtils.currentLine=131085;
 //BA.debugLineNum = 131085;BA.debugLine="Log(\"Android serial: \"&uid.GetAndroidSerial)";
anywheresoftware.b4a.keywords.Common.LogImpl("2131085","Android serial: "+_uid._getandroidserial(),0);
RDebugUtils.currentLine=131086;
 //BA.debugLineNum = 131086;BA.debugLine="Log(\"Android ID: \"&uid.GetAndroidID)";
anywheresoftware.b4a.keywords.Common.LogImpl("2131086","Android ID: "+_uid._getandroidid(),0);
RDebugUtils.currentLine=131087;
 //BA.debugLineNum = 131087;BA.debugLine="Log(\"Random UUID: \"&uid.GetRandomUUID)";
anywheresoftware.b4a.keywords.Common.LogImpl("2131087","Random UUID: "+_uid._getrandomuuid(),0);
RDebugUtils.currentLine=131088;
 //BA.debugLineNum = 131088;BA.debugLine="Log(\"Gmail: \"&uid.GetGAccount) 'activate permissi";
anywheresoftware.b4a.keywords.Common.LogImpl("2131088","Gmail: "+_uid._getgaccount(),0);
RDebugUtils.currentLine=131097;
 //BA.debugLineNum = 131097;BA.debugLine="Log(\"MyUID: \"&uid.MakeDGcode0(False,False))";
anywheresoftware.b4a.keywords.Common.LogImpl("2131097","MyUID: "+_uid._makedgcode0(anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.False),0);
RDebugUtils.currentLine=131102;
 //BA.debugLineNum = 131102;BA.debugLine="DeviceId = uid.GetAndroidID";
_deviceid = _uid._getandroidid();
RDebugUtils.currentLine=131103;
 //BA.debugLineNum = 131103;BA.debugLine="usrEmail = uid.GetGAccount";
_usremail = _uid._getgaccount();
RDebugUtils.currentLine=131105;
 //BA.debugLineNum = 131105;BA.debugLine="GrabaAcceso		' grabar resitro en la tabla";
_grabaacceso();
RDebugUtils.currentLine=131111;
 //BA.debugLineNum = 131111;BA.debugLine="Dim foto As Bitmap";
_foto = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=131112;
 //BA.debugLineNum = 131112;BA.debugLine="Dim texto As String";
_texto = "";
RDebugUtils.currentLine=131114;
 //BA.debugLineNum = 131114;BA.debugLine="Dim fotos As List";
_fotos = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=131115;
 //BA.debugLineNum = 131115;BA.debugLine="fotos.Initialize";
_fotos.Initialize();
RDebugUtils.currentLine=131116;
 //BA.debugLineNum = 131116;BA.debugLine="fotos.Add(\"film-industrial.jpg\")";
_fotos.Add((Object)("film-industrial.jpg"));
RDebugUtils.currentLine=131117;
 //BA.debugLineNum = 131117;BA.debugLine="fotos.Add(\"Papel.jpg\")";
_fotos.Add((Object)("Papel.jpg"));
RDebugUtils.currentLine=131118;
 //BA.debugLineNum = 131118;BA.debugLine="fotos.Add(\"burbuja.jpg\")";
_fotos.Add((Object)("burbuja.jpg"));
RDebugUtils.currentLine=131119;
 //BA.debugLineNum = 131119;BA.debugLine="fotos.Add(\"precinto.jpg\")";
_fotos.Add((Object)("precinto.jpg"));
RDebugUtils.currentLine=131120;
 //BA.debugLineNum = 131120;BA.debugLine="fotos.Add(\"carton-ondulado.jpg\")";
_fotos.Add((Object)("carton-ondulado.jpg"));
RDebugUtils.currentLine=131121;
 //BA.debugLineNum = 131121;BA.debugLine="fotos.Add(\"cinta-impresa.jpg\")";
_fotos.Add((Object)("cinta-impresa.jpg"));
RDebugUtils.currentLine=131123;
 //BA.debugLineNum = 131123;BA.debugLine="Dim textos As List";
_textos = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=131124;
 //BA.debugLineNum = 131124;BA.debugLine="textos.Initialize";
_textos.Initialize();
RDebugUtils.currentLine=131125;
 //BA.debugLineNum = 131125;BA.debugLine="textos.Add(\"FILM ESTIRABLE\")";
_textos.Add((Object)("FILM ESTIRABLE"));
RDebugUtils.currentLine=131126;
 //BA.debugLineNum = 131126;BA.debugLine="textos.Add(\"Papel Kraft y alimentación\")";
_textos.Add((Object)("Papel Kraft y alimentación"));
RDebugUtils.currentLine=131127;
 //BA.debugLineNum = 131127;BA.debugLine="textos.Add(\"Relleno y Protección\")";
_textos.Add((Object)("Relleno y Protección"));
RDebugUtils.currentLine=131128;
 //BA.debugLineNum = 131128;BA.debugLine="textos.Add(\"Precinto\")";
_textos.Add((Object)("Precinto"));
RDebugUtils.currentLine=131129;
 //BA.debugLineNum = 131129;BA.debugLine="textos.Add(\"Carton Ondulado\")";
_textos.Add((Object)("Carton Ondulado"));
RDebugUtils.currentLine=131130;
 //BA.debugLineNum = 131130;BA.debugLine="textos.Add(\"Cinta adhesiva y precinto impreso\")";
_textos.Add((Object)("Cinta adhesiva y precinto impreso"));
RDebugUtils.currentLine=131132;
 //BA.debugLineNum = 131132;BA.debugLine="For f=0 To 5";
{
final int step34 = 1;
final int limit34 = (int) (5);
_f = (int) (0) ;
for (;_f <= limit34 ;_f = _f + step34 ) {
RDebugUtils.currentLine=131133;
 //BA.debugLineNum = 131133;BA.debugLine="foto = LoadBitmapResize(File.DirAssets, fotos.Ge";
_foto = anywheresoftware.b4a.keywords.Common.LoadBitmapResize(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),BA.ObjectToString(_fotos.Get(_f)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=131134;
 //BA.debugLineNum = 131134;BA.debugLine="texto=textos.Get(f)";
_texto = BA.ObjectToString(_textos.Get(_f));
RDebugUtils.currentLine=131135;
 //BA.debugLineNum = 131135;BA.debugLine="CLV1.Add(CreateItem(foto,texto) , \"\" )";
mostCurrent._clv1._add /*String*/ (null,_createitem(_foto,_texto),(Object)(""));
 }
};
RDebugUtils.currentLine=131143;
 //BA.debugLineNum = 131143;BA.debugLine="Dim foto As Bitmap";
_foto = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=131144;
 //BA.debugLineNum = 131144;BA.debugLine="Dim texto As String";
_texto = "";
RDebugUtils.currentLine=131146;
 //BA.debugLineNum = 131146;BA.debugLine="Dim fotos As List";
_fotos = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=131147;
 //BA.debugLineNum = 131147;BA.debugLine="fotos.Initialize";
_fotos.Initialize();
RDebugUtils.currentLine=131148;
 //BA.debugLineNum = 131148;BA.debugLine="fotos.Add(\"formula01.jpg\")";
_fotos.Add((Object)("formula01.jpg"));
RDebugUtils.currentLine=131149;
 //BA.debugLineNum = 131149;BA.debugLine="fotos.Add(\"formula02.jpg\")";
_fotos.Add((Object)("formula02.jpg"));
RDebugUtils.currentLine=131150;
 //BA.debugLineNum = 131150;BA.debugLine="fotos.Add(\"formula03.jpg\")";
_fotos.Add((Object)("formula03.jpg"));
RDebugUtils.currentLine=131151;
 //BA.debugLineNum = 131151;BA.debugLine="fotos.Add(\"formula04.jpg\")";
_fotos.Add((Object)("formula04.jpg"));
RDebugUtils.currentLine=131153;
 //BA.debugLineNum = 131153;BA.debugLine="Dim textos As List";
_textos = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=131154;
 //BA.debugLineNum = 131154;BA.debugLine="textos.Initialize";
_textos.Initialize();
RDebugUtils.currentLine=131155;
 //BA.debugLineNum = 131155;BA.debugLine="textos.Add(\"Formato industrial - Calculo metros\")";
_textos.Add((Object)("Formato industrial - Calculo metros"));
RDebugUtils.currentLine=131156;
 //BA.debugLineNum = 131156;BA.debugLine="textos.Add(\"Formato industrial - Cálculo Micras\")";
_textos.Add((Object)("Formato industrial - Cálculo Micras"));
RDebugUtils.currentLine=131157;
 //BA.debugLineNum = 131157;BA.debugLine="textos.Add(\"Cálculo Preestiro\")";
_textos.Add((Object)("Cálculo Preestiro"));
RDebugUtils.currentLine=131158;
 //BA.debugLineNum = 131158;BA.debugLine="textos.Add(\"Peso Palet (Formatos más habituales)\"";
_textos.Add((Object)("Peso Palet (Formatos más habituales)"));
RDebugUtils.currentLine=131160;
 //BA.debugLineNum = 131160;BA.debugLine="For f=0 To 3";
{
final int step53 = 1;
final int limit53 = (int) (3);
_f = (int) (0) ;
for (;_f <= limit53 ;_f = _f + step53 ) {
RDebugUtils.currentLine=131161;
 //BA.debugLineNum = 131161;BA.debugLine="foto = LoadBitmapResize(File.DirAssets, fotos.Ge";
_foto = anywheresoftware.b4a.keywords.Common.LoadBitmapResize(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),BA.ObjectToString(_fotos.Get(_f)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=131162;
 //BA.debugLineNum = 131162;BA.debugLine="texto=textos.Get(f)";
_texto = BA.ObjectToString(_textos.Get(_f));
RDebugUtils.currentLine=131163;
 //BA.debugLineNum = 131163;BA.debugLine="CLV2.Add(CreateItem(foto,texto) , \"\" )";
mostCurrent._clv2._add /*String*/ (null,_createitem(_foto,_texto),(Object)(""));
 }
};
RDebugUtils.currentLine=131166;
 //BA.debugLineNum = 131166;BA.debugLine="Activity.AddMenuItem(\"Salir\",\"fin\")";
mostCurrent._activity.AddMenuItem(BA.ObjectToCharSequence("Salir"),"fin");
RDebugUtils.currentLine=131167;
 //BA.debugLineNum = 131167;BA.debugLine="End Sub";
return "";
}
public static String  _grabaacceso() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "grabaacceso", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "grabaacceso", null));}
anywheresoftware.b4a.samples.httputils2.httpjob _insertacceso = null;
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Sub GrabaAcceso As String";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="Try";
try {RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="Dim InsertAcceso As HttpJob";
_insertacceso = new anywheresoftware.b4a.samples.httputils2.httpjob();
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="InsertAcceso.Initialize(\"InsertAc\", Me)";
_insertacceso._initialize(processBA,"InsertAc",main.getObject());
RDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="InsertAcceso.download2(\"http://cerolab.com/proye";
_insertacceso._download2("http://cerolab.com/proyectos/aneto/x_accesos.php",new String[]{"action","InsertAcceso","id_dispositivo",_deviceid,"email",_usremail});
RDebugUtils.currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="Return (\"Ok\")";
if (true) return ("Ok");
 } 
       catch (Exception e7) {
			processBA.setLastException(e7);RDebugUtils.currentLine=851975;
 //BA.debugLineNum = 851975;BA.debugLine="Log(LastException.Message)";
anywheresoftware.b4a.keywords.Common.LogImpl("2851975",anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getMessage(),0);
RDebugUtils.currentLine=851976;
 //BA.debugLineNum = 851976;BA.debugLine="Return (\"Error:\" & LastException.Message)";
if (true) return ("Error:"+anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getMessage());
 };
RDebugUtils.currentLine=851978;
 //BA.debugLineNum = 851978;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.B4XViewWrapper  _createitem(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _img,String _descripcion) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createitem", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(mostCurrent.activityBA, "createitem", new Object[] {_img,_descripcion}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="private Sub CreateItem(img As Bitmap, descripcion";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _xui.CreatePanel(processBA,"");
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="p.SetLayoutAnimated(0,0,0,93%x, 120dip)";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (93),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (120)));
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="p.LoadLayout(\"LyProd\")";
_p.LoadLayout("LyProd",mostCurrent.activityBA);
RDebugUtils.currentLine=720900;
 //BA.debugLineNum = 720900;BA.debugLine="IvFoto.Bitmap=img";
mostCurrent._ivfoto.setBitmap((android.graphics.Bitmap)(_img.getObject()));
RDebugUtils.currentLine=720901;
 //BA.debugLineNum = 720901;BA.debugLine="LbDescrip.Text=descripcion";
mostCurrent._lbdescrip.setText(BA.ObjectToCharSequence(_descripcion));
RDebugUtils.currentLine=720902;
 //BA.debugLineNum = 720902;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=720903;
 //BA.debugLineNum = 720903;BA.debugLine="End Sub";
return null;
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="End Sub";
return "";
}
public static String  _clv1_itemclick(int _index,Object _value) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "clv1_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "clv1_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Sub CLV1_ItemClick (Index As Int, Value As Object)";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="Index = Index+1";
_index = (int) (_index+1);
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="If Index=1 Then OpenPdf(\"producto01.pdf\")";
if (_index==1) { 
_openpdf("producto01.pdf");};
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="If Index=2 Then OpenPdf(\"producto02.pdf\")";
if (_index==2) { 
_openpdf("producto02.pdf");};
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="If Index=3 Then OpenPdf(\"producto03.pdf\")";
if (_index==3) { 
_openpdf("producto03.pdf");};
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="If Index=4 Then OpenPdf(\"producto04.pdf\")";
if (_index==4) { 
_openpdf("producto04.pdf");};
RDebugUtils.currentLine=983046;
 //BA.debugLineNum = 983046;BA.debugLine="CLV1.Refresh";
mostCurrent._clv1._refresh /*String*/ (null);
RDebugUtils.currentLine=983047;
 //BA.debugLineNum = 983047;BA.debugLine="End Sub";
return "";
}
public static String  _openpdf(String _fichero) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "openpdf", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "openpdf", new Object[] {_fichero}));}
String _filename = "";
anywheresoftware.b4a.objects.IntentWrapper _in = null;
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Sub OpenPdf(fichero As String)";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="Try";
try {RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="Log(\"OpenPdf:\"&fichero)";
anywheresoftware.b4a.keywords.Common.LogImpl("21114115","OpenPdf:"+_fichero,0);
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="Dim FileName As String = fichero";
_filename = _fichero;
RDebugUtils.currentLine=1114122;
 //BA.debugLineNum = 1114122;BA.debugLine="File.Copy(File.DirAssets, FileName, Starter.Prov";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_filename,mostCurrent._starter._provider /*anetocalcV4.cerolab.fileprovider*/ ._sharedfolder /*String*/ ,_filename);
RDebugUtils.currentLine=1114123;
 //BA.debugLineNum = 1114123;BA.debugLine="Dim in As Intent";
_in = new anywheresoftware.b4a.objects.IntentWrapper();
RDebugUtils.currentLine=1114124;
 //BA.debugLineNum = 1114124;BA.debugLine="in.Initialize(in.ACTION_VIEW, \"\")";
_in.Initialize(_in.ACTION_VIEW,"");
RDebugUtils.currentLine=1114125;
 //BA.debugLineNum = 1114125;BA.debugLine="Starter.Provider.SetFileUriAsIntentData(in, File";
mostCurrent._starter._provider /*anetocalcV4.cerolab.fileprovider*/ ._setfileuriasintentdata /*String*/ (null,_in,_filename);
RDebugUtils.currentLine=1114127;
 //BA.debugLineNum = 1114127;BA.debugLine="in.SetType(\"application/pdf\")";
_in.SetType("application/pdf");
RDebugUtils.currentLine=1114128;
 //BA.debugLineNum = 1114128;BA.debugLine="StartActivity(in)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(_in.getObject()));
 } 
       catch (Exception e11) {
			processBA.setLastException(e11);RDebugUtils.currentLine=1114183;
 //BA.debugLineNum = 1114183;BA.debugLine="Log(LastException.Message)";
anywheresoftware.b4a.keywords.Common.LogImpl("21114183",anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getMessage(),0);
 };
RDebugUtils.currentLine=1114186;
 //BA.debugLineNum = 1114186;BA.debugLine="End Sub";
return "";
}
public static String  _clv2_itemclick(int _index,Object _value) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "clv2_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "clv2_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Sub CLV2_ItemClick (Index As Int, Value As Object)";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="Index = Index+1";
_index = (int) (_index+1);
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="If Index=1 Then StartActivity(\"AcFormula01\")";
if (_index==1) { 
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("AcFormula01"));};
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="If Index=2 Then StartActivity(\"AcFormula02\")";
if (_index==2) { 
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("AcFormula02"));};
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="If Index=3 Then StartActivity(\"AcFormula03\")";
if (_index==3) { 
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("AcFormula03"));};
RDebugUtils.currentLine=1048581;
 //BA.debugLineNum = 1048581;BA.debugLine="If Index=4 Then OpenPdf(\"medidaspalet.pdf\")";
if (_index==4) { 
_openpdf("medidaspalet.pdf");};
RDebugUtils.currentLine=1048582;
 //BA.debugLineNum = 1048582;BA.debugLine="CLV2.Refresh";
mostCurrent._clv2._refresh /*String*/ (null);
RDebugUtils.currentLine=1048583;
 //BA.debugLineNum = 1048583;BA.debugLine="End Sub";
return "";
}
public static String  _fin_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "fin_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "fin_click", null));}
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="private Sub fin_click";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="Log(\"SALIR\")";
anywheresoftware.b4a.keywords.Common.LogImpl("2786433","SALIR",0);
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(anywheresoftware.b4a.samples.httputils2.httpjob _job) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "jobdone", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_job}));}
String _res = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Sub JobDone(Job As HttpJob)";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="If Job.Success Then";
if (_job._success) { 
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="Dim res As String";
_res = "";
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="res = Job.GetString";
_res = _job._getstring();
RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="Log(\"Back from Job:\" & Job.JobName )";
anywheresoftware.b4a.keywords.Common.LogImpl("2917509","Back from Job:"+_job._jobname,0);
RDebugUtils.currentLine=917510;
 //BA.debugLineNum = 917510;BA.debugLine="Log(\"Response from server: \" & res)";
anywheresoftware.b4a.keywords.Common.LogImpl("2917510","Response from server: "+_res,0);
RDebugUtils.currentLine=917512;
 //BA.debugLineNum = 917512;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=917513;
 //BA.debugLineNum = 917513;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
RDebugUtils.currentLine=917515;
 //BA.debugLineNum = 917515;BA.debugLine="Select Job.JobName";
switch (BA.switchObjectToInt(_job._jobname,"CountP","InsertAc")) {
case 0: {
 break; }
case 1: {
 break; }
}
;
 }else {
RDebugUtils.currentLine=917528;
 //BA.debugLineNum = 917528;BA.debugLine="ToastMessageShow(\"Error: \" & Job.ErrorMessage, T";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Error: "+_job._errormessage),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=917530;
 //BA.debugLineNum = 917530;BA.debugLine="Job.Release";
_job._release();
RDebugUtils.currentLine=917531;
 //BA.debugLineNum = 917531;BA.debugLine="End Sub";
return "";
}
}