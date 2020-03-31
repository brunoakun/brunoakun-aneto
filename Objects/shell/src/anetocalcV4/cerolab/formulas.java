
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

public class formulas implements IRemote{
	public static formulas mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public formulas() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
     private static PCBA pcBA = new PCBA(null, formulas.class);
    static {
		mostCurrent = new formulas();
        remoteMe = RemoteObject.declareNull("anetocalcV4.cerolab.formulas");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("formulas"), "anetocalcV4.cerolab.formulas");
        RDebug.INSTANCE.eventTargets.put(new DeviceClass("anetocalcV4.cerolab.formulas"), new java.lang.ref.WeakReference<PCBA> (pcBA));
	}
   
	public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
	public PCBA create(Object[] args) throws ClassNotFoundException{
        throw new RuntimeException("CREATE is not supported.");
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _httputils2service = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httputils2service");
public static anetocalcV4.cerolab.main _main = null;
public static anetocalcV4.cerolab.starter _starter = null;
public static anetocalcV4.cerolab.acformula01 _acformula01 = null;
public static anetocalcV4.cerolab.acformula02 _acformula02 = null;
public static anetocalcV4.cerolab.acformula03 _acformula03 = null;
  public Object[] GetGlobals() {
		return new Object[] {"AcFormula01",Debug.moduleToString(anetocalcV4.cerolab.acformula01.class),"AcFormula02",Debug.moduleToString(anetocalcV4.cerolab.acformula02.class),"AcFormula03",Debug.moduleToString(anetocalcV4.cerolab.acformula03.class),"HttpUtils2Service",formulas.mostCurrent._httputils2service,"Main",Debug.moduleToString(anetocalcV4.cerolab.main.class),"Starter",Debug.moduleToString(anetocalcV4.cerolab.starter.class)};
}
}