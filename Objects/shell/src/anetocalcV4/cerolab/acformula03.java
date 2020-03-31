
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

public class acformula03 implements IRemote{
	public static acformula03 mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public acformula03() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("acformula03"), "anetocalcV4.cerolab.acformula03");
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
		pcBA = new PCBA(this, acformula03.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _a = RemoteObject.createImmutable(0f);
public static RemoteObject _b = RemoteObject.createImmutable(0f);
public static RemoteObject _c = RemoteObject.createImmutable(0f);
public static RemoteObject _d = RemoteObject.createImmutable(0f);
public static RemoteObject _e = RemoteObject.createImmutable(0f);
public static RemoteObject _f = RemoteObject.createImmutable(0f);
public static RemoteObject _g = RemoteObject.createImmutable(0f);
public static RemoteObject _eta = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _etb = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _etc = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _etd = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _ete = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _etf = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _lbresultpalet = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _httputils2service = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httputils2service");
public static anetocalcV4.cerolab.main _main = null;
public static anetocalcV4.cerolab.starter _starter = null;
public static anetocalcV4.cerolab.acformula01 _acformula01 = null;
public static anetocalcV4.cerolab.acformula02 _acformula02 = null;
public static anetocalcV4.cerolab.formulas _formulas = null;
  public Object[] GetGlobals() {
		return new Object[] {"A",acformula03._a,"AcFormula01",Debug.moduleToString(anetocalcV4.cerolab.acformula01.class),"AcFormula02",Debug.moduleToString(anetocalcV4.cerolab.acformula02.class),"Activity",acformula03.mostCurrent._activity,"B",acformula03._b,"C",acformula03._c,"D",acformula03._d,"E",acformula03._e,"EtA",acformula03.mostCurrent._eta,"EtB",acformula03.mostCurrent._etb,"EtC",acformula03.mostCurrent._etc,"EtD",acformula03.mostCurrent._etd,"EtE",acformula03.mostCurrent._ete,"EtF",acformula03.mostCurrent._etf,"F",acformula03._f,"formulas",Debug.moduleToString(anetocalcV4.cerolab.formulas.class),"G",acformula03._g,"HttpUtils2Service",acformula03.mostCurrent._httputils2service,"LbResult",acformula03.mostCurrent._lbresult,"LbResultPalet",acformula03.mostCurrent._lbresultpalet,"Main",Debug.moduleToString(anetocalcV4.cerolab.main.class),"Starter",Debug.moduleToString(anetocalcV4.cerolab.starter.class)};
}
}