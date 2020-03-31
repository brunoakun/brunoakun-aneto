package anetocalcV4.cerolab;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class acformula02_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (acformula02) ","acformula02",3,acformula02.mostCurrent.activityBA,acformula02.mostCurrent,27);
if (RapidSub.canDelegate("activity_create")) { return anetocalcV4.cerolab.acformula02.remoteMe.runUserSub(false, "acformula02","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 27;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 30;BA.debugLine="Activity.LoadLayout(\"LyFormula02\")";
Debug.ShouldStop(536870912);
acformula02.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("LyFormula02")),acformula02.mostCurrent.activityBA);
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (acformula02) ","acformula02",3,acformula02.mostCurrent.activityBA,acformula02.mostCurrent,58);
if (RapidSub.canDelegate("activity_pause")) { return anetocalcV4.cerolab.acformula02.remoteMe.runUserSub(false, "acformula02","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 58;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 59;BA.debugLine="Log(\"Formula02 Activity_Pause\")";
Debug.ShouldStop(67108864);
acformula02.mostCurrent.__c.runVoidMethod ("LogImpl","22555905",RemoteObject.createImmutable("Formula02 Activity_Pause"),0);
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (acformula02) ","acformula02",3,acformula02.mostCurrent.activityBA,acformula02.mostCurrent,54);
if (RapidSub.canDelegate("activity_resume")) { return anetocalcV4.cerolab.acformula02.remoteMe.runUserSub(false, "acformula02","activity_resume");}
 BA.debugLineNum = 54;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 55;BA.debugLine="Log(\"Formula02 Activity_Resume\")";
Debug.ShouldStop(4194304);
acformula02.mostCurrent.__c.runVoidMethod ("LogImpl","22490369",RemoteObject.createImmutable("Formula02 Activity_Resume"),0);
 BA.debugLineNum = 56;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clacula01() throws Exception{
try {
		Debug.PushSubsStack("clacula01 (acformula02) ","acformula02",3,acformula02.mostCurrent.activityBA,acformula02.mostCurrent,64);
if (RapidSub.canDelegate("clacula01")) { return anetocalcV4.cerolab.acformula02.remoteMe.runUserSub(false, "acformula02","clacula01");}
RemoteObject _cal = RemoteObject.createImmutable(0f);
 BA.debugLineNum = 64;BA.debugLine="Sub clacula01 As String";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 67;BA.debugLine="Dim cal As Float";
Debug.ShouldStop(4);
_cal = RemoteObject.createImmutable(0f);Debug.locals.put("cal", _cal);
 BA.debugLineNum = 70;BA.debugLine="If B > 9999 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean(">",acformula02._b,BA.numberCast(double.class, 9999))) { 
 BA.debugLineNum = 71;BA.debugLine="B=9999";
Debug.ShouldStop(64);
acformula02._b = BA.numberCast(float.class, 9999);
 BA.debugLineNum = 72;BA.debugLine="EtB.Text=B";
Debug.ShouldStop(128);
acformula02.mostCurrent._etb.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(acformula02._b));
 };
 BA.debugLineNum = 75;BA.debugLine="If A=0 And B=0 And C=0 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",acformula02._a,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("=",acformula02._b,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("=",acformula02._c,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 76;BA.debugLine="Return(0)";
Debug.ShouldStop(2048);
if (true) return BA.NumberToString((0));
 };
 BA.debugLineNum = 80;BA.debugLine="cal=(A/(3*0.92*B)*100)";
Debug.ShouldStop(32768);
_cal = BA.numberCast(float.class, (RemoteObject.solve(new RemoteObject[] {acformula02._a,(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(3),RemoteObject.createImmutable(0.92),acformula02._b}, "**",0, 0)),RemoteObject.createImmutable(100)}, "/*",0, 0)));Debug.locals.put("cal", _cal);
 BA.debugLineNum = 81;BA.debugLine="Log(\"calculo=\" &  cal)";
Debug.ShouldStop(65536);
acformula02.mostCurrent.__c.runVoidMethod ("LogImpl","22621457",RemoteObject.concat(RemoteObject.createImmutable("calculo="),_cal),0);
 BA.debugLineNum = 83;BA.debugLine="If cal=\"-Infinity\" Or cal=\"Infinity\" Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_cal,BA.numberCast(double.class, "-Infinity")) || RemoteObject.solveBoolean("=",_cal,BA.numberCast(double.class, "Infinity"))) { 
 BA.debugLineNum = 84;BA.debugLine="Return(\"0\")";
Debug.ShouldStop(524288);
if (true) return (RemoteObject.createImmutable("0"));
 };
 BA.debugLineNum = 87;BA.debugLine="Return(NumberFormat (cal,0,2))";
Debug.ShouldStop(4194304);
if (true) return (acformula02.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _cal)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2))));
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _eta_focuschanged(RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("EtA_FocusChanged (acformula02) ","acformula02",3,acformula02.mostCurrent.activityBA,acformula02.mostCurrent,91);
if (RapidSub.canDelegate("eta_focuschanged")) { return anetocalcV4.cerolab.acformula02.remoteMe.runUserSub(false, "acformula02","eta_focuschanged", _hasfocus);}
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 91;BA.debugLine="Sub EtA_FocusChanged (HasFocus As Boolean)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 92;BA.debugLine="If HasFocus Then EtA.Text=\"\"";
Debug.ShouldStop(134217728);
if (_hasfocus.<Boolean>get().booleanValue()) { 
acformula02.mostCurrent._eta.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));};
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _eta_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EtA_TextChanged (acformula02) ","acformula02",3,acformula02.mostCurrent.activityBA,acformula02.mostCurrent,35);
if (RapidSub.canDelegate("eta_textchanged")) { return anetocalcV4.cerolab.acformula02.remoteMe.runUserSub(false, "acformula02","eta_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 35;BA.debugLine="Sub EtA_TextChanged (Old As String, New As String)";
Debug.ShouldStop(4);
 BA.debugLineNum = 36;BA.debugLine="If New = \"\" Or New=\".\" Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_new,BA.ObjectToString("")) || RemoteObject.solveBoolean("=",_new,BA.ObjectToString("."))) { 
 BA.debugLineNum = 37;BA.debugLine="A=0";
Debug.ShouldStop(16);
acformula02._a = BA.numberCast(float.class, 0);
 }else {
 BA.debugLineNum = 39;BA.debugLine="A=New";
Debug.ShouldStop(64);
acformula02._a = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 41;BA.debugLine="LbResult.Text = clacula01";
Debug.ShouldStop(256);
acformula02.mostCurrent._lbresult.runMethod(true,"setText",BA.ObjectToCharSequence(_clacula01()));
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _etb_focuschanged(RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("EtB_FocusChanged (acformula02) ","acformula02",3,acformula02.mostCurrent.activityBA,acformula02.mostCurrent,94);
if (RapidSub.canDelegate("etb_focuschanged")) { return anetocalcV4.cerolab.acformula02.remoteMe.runUserSub(false, "acformula02","etb_focuschanged", _hasfocus);}
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 94;BA.debugLine="Sub EtB_FocusChanged (HasFocus As Boolean)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 95;BA.debugLine="If HasFocus Then EtB.Text=\"\"";
Debug.ShouldStop(1073741824);
if (_hasfocus.<Boolean>get().booleanValue()) { 
acformula02.mostCurrent._etb.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));};
 BA.debugLineNum = 96;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _etb_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EtB_TextChanged (acformula02) ","acformula02",3,acformula02.mostCurrent.activityBA,acformula02.mostCurrent,44);
if (RapidSub.canDelegate("etb_textchanged")) { return anetocalcV4.cerolab.acformula02.remoteMe.runUserSub(false, "acformula02","etb_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 44;BA.debugLine="Sub EtB_TextChanged (Old As String, New As String)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 45;BA.debugLine="If New = \"\" Or New=\".\" Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_new,BA.ObjectToString("")) || RemoteObject.solveBoolean("=",_new,BA.ObjectToString("."))) { 
 BA.debugLineNum = 46;BA.debugLine="B=0";
Debug.ShouldStop(8192);
acformula02._b = BA.numberCast(float.class, 0);
 }else {
 BA.debugLineNum = 48;BA.debugLine="B=New";
Debug.ShouldStop(32768);
acformula02._b = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 50;BA.debugLine="LbResult.Text = clacula01";
Debug.ShouldStop(131072);
acformula02.mostCurrent._lbresult.runMethod(true,"setText",BA.ObjectToCharSequence(_clacula01()));
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 19;BA.debugLine="Public A,B,C,D As Float = 0";
acformula02._a = RemoteObject.createImmutable(0f);
acformula02._b = RemoteObject.createImmutable(0f);
acformula02._c = RemoteObject.createImmutable(0f);
acformula02._d = BA.numberCast(float.class, 0);
 //BA.debugLineNum = 21;BA.debugLine="Private EtA As EditText";
acformula02.mostCurrent._eta = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private EtB As EditText";
acformula02.mostCurrent._etb = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private LbResult As Label";
acformula02.mostCurrent._lbresult = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private LbTitulo As Label";
acformula02.mostCurrent._lbtitulo = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 10;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}