
package anetocalcV4.cerolab;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class customlistview {
    public static RemoteObject myClass;
	public customlistview() {
	}
    public static PCBA staticBA = new PCBA(null, customlistview.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _sv = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _items = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _mdividersize = RemoteObject.createImmutable(0f);
public static RemoteObject _eventname = RemoteObject.createImmutable("");
public static RemoteObject _callback = RemoteObject.declareNull("Object");
public static RemoteObject _defaulttextcolor = RemoteObject.createImmutable(0);
public static RemoteObject _defaulttextbackgroundcolor = RemoteObject.createImmutable(0);
public static RemoteObject _animationduration = RemoteObject.createImmutable(0);
public static RemoteObject _lastreachendevent = RemoteObject.createImmutable(0L);
public static RemoteObject _pressedcolor = RemoteObject.createImmutable(0);
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _designerlabel = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _horizontal = RemoteObject.createImmutable(false);
public static RemoteObject _su = RemoteObject.declareNull("anywheresoftware.b4a.objects.StringUtils");
public static RemoteObject _mfirstvisibleindex = RemoteObject.createImmutable(0);
public static RemoteObject _mlastvisibleindex = RemoteObject.createImmutable(0);
public static RemoteObject _monitorvisiblerange = RemoteObject.createImmutable(false);
public static RemoteObject _firescrollchanged = RemoteObject.createImmutable(false);
public static RemoteObject _scrollbarsvisible = RemoteObject.createImmutable(false);
public static RemoteObject _httputils2service = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httputils2service");
public static anetocalcV4.cerolab.main _main = null;
public static anetocalcV4.cerolab.starter _starter = null;
public static anetocalcV4.cerolab.acformula01 _acformula01 = null;
public static anetocalcV4.cerolab.acformula02 _acformula02 = null;
public static anetocalcV4.cerolab.acformula03 _acformula03 = null;
public static anetocalcV4.cerolab.formulas _formulas = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"AnimationDuration",_ref.getField(false, "_animationduration"),"CallBack",_ref.getField(false, "_callback"),"DefaultTextBackgroundColor",_ref.getField(false, "_defaulttextbackgroundcolor"),"DefaultTextColor",_ref.getField(false, "_defaulttextcolor"),"DesignerLabel",_ref.getField(false, "_designerlabel"),"EventName",_ref.getField(false, "_eventname"),"FireScrollChanged",_ref.getField(false, "_firescrollchanged"),"horizontal",_ref.getField(false, "_horizontal"),"HttpUtils2Service",_ref.getField(false, "_httputils2service"),"items",_ref.getField(false, "_items"),"LastReachEndEvent",_ref.getField(false, "_lastreachendevent"),"mBase",_ref.getField(false, "_mbase"),"mDividerSize",_ref.getField(false, "_mdividersize"),"mFirstVisibleIndex",_ref.getField(false, "_mfirstvisibleindex"),"mLastVisibleIndex",_ref.getField(false, "_mlastvisibleindex"),"MonitorVisibleRange",_ref.getField(false, "_monitorvisiblerange"),"PressedColor",_ref.getField(false, "_pressedcolor"),"ScrollBarsVisible",_ref.getField(false, "_scrollbarsvisible"),"su",_ref.getField(false, "_su"),"sv",_ref.getField(false, "_sv"),"xui",_ref.getField(false, "_xui")};
}
}