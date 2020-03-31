
package anetocalcV4.cerolab;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class main implements IRemote{
	public static main mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public main() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("main"), "anetocalcV4.cerolab.main");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, main.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _usremail = RemoteObject.createImmutable("");
public static RemoteObject _deviceid = RemoteObject.createImmutable("");
public static RemoteObject _lbtitulo = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _tabhost1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.TabHostWrapper");
public static RemoteObject _btcontacto = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _clv1 = RemoteObject.declareNull("anetocalcV4.cerolab.customlistview");
public static RemoteObject _clv2 = RemoteObject.declareNull("anetocalcV4.cerolab.customlistview");
public static RemoteObject _ivfoto = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _lbdescrip = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _httputils2service = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httputils2service");
public static anetocalcV4.cerolab.starter _starter = null;
public static anetocalcV4.cerolab.acformula01 _acformula01 = null;
public static anetocalcV4.cerolab.acformula02 _acformula02 = null;
public static anetocalcV4.cerolab.acformula03 _acformula03 = null;
public static anetocalcV4.cerolab.formulas _formulas = null;
  public Object[] GetGlobals() {
		return new Object[] {"AcFormula01",Debug.moduleToString(anetocalcV4.cerolab.acformula01.class),"AcFormula02",Debug.moduleToString(anetocalcV4.cerolab.acformula02.class),"AcFormula03",Debug.moduleToString(anetocalcV4.cerolab.acformula03.class),"Activity",main.mostCurrent._activity,"BtContacto",main.mostCurrent._btcontacto,"CLV1",main.mostCurrent._clv1,"CLV2",main.mostCurrent._clv2,"DeviceId",main._deviceid,"formulas",Debug.moduleToString(anetocalcV4.cerolab.formulas.class),"HttpUtils2Service",main.mostCurrent._httputils2service,"IvFoto",main.mostCurrent._ivfoto,"LbDescrip",main.mostCurrent._lbdescrip,"LbTitulo",main.mostCurrent._lbtitulo,"Starter",Debug.moduleToString(anetocalcV4.cerolab.starter.class),"TabHost1",main.mostCurrent._tabhost1,"usrEmail",main._usremail,"xui",main._xui};
}
}