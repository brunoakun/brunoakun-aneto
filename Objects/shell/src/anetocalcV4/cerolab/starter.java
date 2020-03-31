
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

public class starter implements IRemote{
	public static starter mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public starter() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("starter"), "anetocalcV4.cerolab.starter");
	}
     public static RemoteObject getObject() {
		return myClass;
	 }
	public RemoteObject _service;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
        _service = (RemoteObject) args[2];
        remoteMe = RemoteObject.declareNull("anetocalcV4.cerolab.starter");
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[3];
		pcBA = new PCBA(this, starter.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _provider = RemoteObject.declareNull("anetocalcV4.cerolab.fileprovider");
public static RemoteObject _httputils2service = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httputils2service");
public static anetocalcV4.cerolab.main _main = null;
public static anetocalcV4.cerolab.acformula01 _acformula01 = null;
public static anetocalcV4.cerolab.acformula02 _acformula02 = null;
public static anetocalcV4.cerolab.acformula03 _acformula03 = null;
public static anetocalcV4.cerolab.formulas _formulas = null;
  public Object[] GetGlobals() {
		return new Object[] {"AcFormula01",Debug.moduleToString(anetocalcV4.cerolab.acformula01.class),"AcFormula02",Debug.moduleToString(anetocalcV4.cerolab.acformula02.class),"AcFormula03",Debug.moduleToString(anetocalcV4.cerolab.acformula03.class),"formulas",Debug.moduleToString(anetocalcV4.cerolab.formulas.class),"HttpUtils2Service",starter.mostCurrent._httputils2service,"Main",Debug.moduleToString(anetocalcV4.cerolab.main.class),"Provider",starter._provider,"Service",starter.mostCurrent._service};
}
}