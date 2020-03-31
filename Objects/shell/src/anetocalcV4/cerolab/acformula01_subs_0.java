package anetocalcV4.cerolab;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class acformula01_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (acformula01) ","acformula01",2,acformula01.mostCurrent.activityBA,acformula01.mostCurrent,29);
if (RapidSub.canDelegate("activity_create")) { return anetocalcV4.cerolab.acformula01.remoteMe.runUserSub(false, "acformula01","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 29;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 32;BA.debugLine="Activity.LoadLayout(\"LyFormula01\")";
Debug.ShouldStop(-2147483648);
acformula01.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("LyFormula01")),acformula01.mostCurrent.activityBA);
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("Activity_Pause (acformula01) ","acformula01",2,acformula01.mostCurrent.activityBA,acformula01.mostCurrent,84);
if (RapidSub.canDelegate("activity_pause")) { return anetocalcV4.cerolab.acformula01.remoteMe.runUserSub(false, "acformula01","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 84;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 85;BA.debugLine="Log(\"Formula01 Activity_Pause\")";
Debug.ShouldStop(1048576);
acformula01.mostCurrent.__c.runVoidMethod ("LogImpl","21769473",RemoteObject.createImmutable("Formula01 Activity_Pause"),0);
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("Activity_Resume (acformula01) ","acformula01",2,acformula01.mostCurrent.activityBA,acformula01.mostCurrent,80);
if (RapidSub.canDelegate("activity_resume")) { return anetocalcV4.cerolab.acformula01.remoteMe.runUserSub(false, "acformula01","activity_resume");}
 BA.debugLineNum = 80;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(32768);
 BA.debugLineNum = 81;BA.debugLine="Log(\"Formula01 Activity_Resume\")";
Debug.ShouldStop(65536);
acformula01.mostCurrent.__c.runVoidMethod ("LogImpl","21703937",RemoteObject.createImmutable("Formula01 Activity_Resume"),0);
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btsalir_click() throws Exception{
try {
		Debug.PushSubsStack("BtSalir_Click (acformula01) ","acformula01",2,acformula01.mostCurrent.activityBA,acformula01.mostCurrent,37);
if (RapidSub.canDelegate("btsalir_click")) { return anetocalcV4.cerolab.acformula01.remoteMe.runUserSub(false, "acformula01","btsalir_click");}
 BA.debugLineNum = 37;BA.debugLine="Sub BtSalir_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="StartActivity(\"Main\")";
Debug.ShouldStop(32);
acformula01.mostCurrent.__c.runVoidMethod ("StartActivity",acformula01.processBA,(Object)((RemoteObject.createImmutable("Main"))));
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("clacula01 (acformula01) ","acformula01",2,acformula01.mostCurrent.activityBA,acformula01.mostCurrent,90);
if (RapidSub.canDelegate("clacula01")) { return anetocalcV4.cerolab.acformula01.remoteMe.runUserSub(false, "acformula01","clacula01");}
RemoteObject _cal = RemoteObject.createImmutable(0f);
 BA.debugLineNum = 90;BA.debugLine="Sub clacula01 As String";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 93;BA.debugLine="Dim cal As Float";
Debug.ShouldStop(268435456);
_cal = RemoteObject.createImmutable(0f);Debug.locals.put("cal", _cal);
 BA.debugLineNum = 96;BA.debugLine="If B > 9999 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean(">",acformula01._b,BA.numberCast(double.class, 9999))) { 
 BA.debugLineNum = 97;BA.debugLine="B=9999";
Debug.ShouldStop(1);
acformula01._b = BA.numberCast(float.class, 9999);
 BA.debugLineNum = 98;BA.debugLine="EtB.Text=B";
Debug.ShouldStop(2);
acformula01.mostCurrent._etb.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(acformula01._b));
 };
 BA.debugLineNum = 101;BA.debugLine="If C > 9999 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean(">",acformula01._c,BA.numberCast(double.class, 9999))) { 
 BA.debugLineNum = 102;BA.debugLine="C=9999";
Debug.ShouldStop(32);
acformula01._c = BA.numberCast(float.class, 9999);
 BA.debugLineNum = 103;BA.debugLine="EtC.Text=C";
Debug.ShouldStop(64);
acformula01.mostCurrent._etc.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(acformula01._c));
 };
 BA.debugLineNum = 106;BA.debugLine="If D=0 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",acformula01._d,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 107;BA.debugLine="Return(0)";
Debug.ShouldStop(1024);
if (true) return BA.NumberToString((0));
 };
 BA.debugLineNum = 110;BA.debugLine="If A=0 And B=0 And C=0 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",acformula01._a,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("=",acformula01._b,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("=",acformula01._c,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 111;BA.debugLine="Return(0)";
Debug.ShouldStop(16384);
if (true) return BA.NumberToString((0));
 };
 BA.debugLineNum = 115;BA.debugLine="cal=(B-C ) / (0.92*D*A)*1000";
Debug.ShouldStop(262144);
_cal = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {acformula01._b,acformula01._c}, "-",1, 0)),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.92),acformula01._d,acformula01._a}, "**",0, 0)),RemoteObject.createImmutable(1000)}, "/*",0, 0));Debug.locals.put("cal", _cal);
 BA.debugLineNum = 116;BA.debugLine="Log(\"calcula01=\" &  cal)";
Debug.ShouldStop(524288);
acformula01.mostCurrent.__c.runVoidMethod ("LogImpl","21835034",RemoteObject.concat(RemoteObject.createImmutable("calcula01="),_cal),0);
 BA.debugLineNum = 118;BA.debugLine="If cal=\"-Infinity\" Or cal=\"Infinity\" Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_cal,BA.numberCast(double.class, "-Infinity")) || RemoteObject.solveBoolean("=",_cal,BA.numberCast(double.class, "Infinity"))) { 
 BA.debugLineNum = 119;BA.debugLine="Return(\"Error\")";
Debug.ShouldStop(4194304);
if (true) return (RemoteObject.createImmutable("Error"));
 };
 BA.debugLineNum = 122;BA.debugLine="Return(NumberFormat (cal,0,2))";
Debug.ShouldStop(33554432);
if (true) return (acformula01.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _cal)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2))));
 BA.debugLineNum = 123;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("EtA_FocusChanged (acformula01) ","acformula01",2,acformula01.mostCurrent.activityBA,acformula01.mostCurrent,126);
if (RapidSub.canDelegate("eta_focuschanged")) { return anetocalcV4.cerolab.acformula01.remoteMe.runUserSub(false, "acformula01","eta_focuschanged", _hasfocus);}
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 126;BA.debugLine="Sub EtA_FocusChanged (HasFocus As Boolean)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 127;BA.debugLine="If HasFocus Then EtA.Text=\"\"";
Debug.ShouldStop(1073741824);
if (_hasfocus.<Boolean>get().booleanValue()) { 
acformula01.mostCurrent._eta.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));};
 BA.debugLineNum = 128;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("EtA_TextChanged (acformula01) ","acformula01",2,acformula01.mostCurrent.activityBA,acformula01.mostCurrent,43);
if (RapidSub.canDelegate("eta_textchanged")) { return anetocalcV4.cerolab.acformula01.remoteMe.runUserSub(false, "acformula01","eta_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 43;BA.debugLine="Sub EtA_TextChanged (Old As String, New As String)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 44;BA.debugLine="If New = \"\" Or New=\".\" Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_new,BA.ObjectToString("")) || RemoteObject.solveBoolean("=",_new,BA.ObjectToString("."))) { 
 BA.debugLineNum = 45;BA.debugLine="A=0";
Debug.ShouldStop(4096);
acformula01._a = BA.numberCast(float.class, 0);
 }else {
 BA.debugLineNum = 47;BA.debugLine="A=New";
Debug.ShouldStop(16384);
acformula01._a = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 49;BA.debugLine="LbResult.Text = clacula01";
Debug.ShouldStop(65536);
acformula01.mostCurrent._lbresult.runMethod(true,"setText",BA.ObjectToCharSequence(_clacula01()));
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("EtB_FocusChanged (acformula01) ","acformula01",2,acformula01.mostCurrent.activityBA,acformula01.mostCurrent,129);
if (RapidSub.canDelegate("etb_focuschanged")) { return anetocalcV4.cerolab.acformula01.remoteMe.runUserSub(false, "acformula01","etb_focuschanged", _hasfocus);}
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 129;BA.debugLine="Sub EtB_FocusChanged (HasFocus As Boolean)";
Debug.ShouldStop(1);
 BA.debugLineNum = 130;BA.debugLine="If HasFocus Then EtB.Text=\"\"";
Debug.ShouldStop(2);
if (_hasfocus.<Boolean>get().booleanValue()) { 
acformula01.mostCurrent._etb.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));};
 BA.debugLineNum = 131;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("EtB_TextChanged (acformula01) ","acformula01",2,acformula01.mostCurrent.activityBA,acformula01.mostCurrent,52);
if (RapidSub.canDelegate("etb_textchanged")) { return anetocalcV4.cerolab.acformula01.remoteMe.runUserSub(false, "acformula01","etb_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 52;BA.debugLine="Sub EtB_TextChanged (Old As String, New As String)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="If New = \"\" Or New=\".\" Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_new,BA.ObjectToString("")) || RemoteObject.solveBoolean("=",_new,BA.ObjectToString("."))) { 
 BA.debugLineNum = 54;BA.debugLine="B=0";
Debug.ShouldStop(2097152);
acformula01._b = BA.numberCast(float.class, 0);
 }else {
 BA.debugLineNum = 56;BA.debugLine="B=New";
Debug.ShouldStop(8388608);
acformula01._b = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 58;BA.debugLine="LbResult.Text = clacula01";
Debug.ShouldStop(33554432);
acformula01.mostCurrent._lbresult.runMethod(true,"setText",BA.ObjectToCharSequence(_clacula01()));
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _etc_focuschanged(RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("EtC_FocusChanged (acformula01) ","acformula01",2,acformula01.mostCurrent.activityBA,acformula01.mostCurrent,132);
if (RapidSub.canDelegate("etc_focuschanged")) { return anetocalcV4.cerolab.acformula01.remoteMe.runUserSub(false, "acformula01","etc_focuschanged", _hasfocus);}
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 132;BA.debugLine="Sub EtC_FocusChanged (HasFocus As Boolean)";
Debug.ShouldStop(8);
 BA.debugLineNum = 133;BA.debugLine="If HasFocus Then EtC.Text=\"\"";
Debug.ShouldStop(16);
if (_hasfocus.<Boolean>get().booleanValue()) { 
acformula01.mostCurrent._etc.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));};
 BA.debugLineNum = 134;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _etc_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EtC_TextChanged (acformula01) ","acformula01",2,acformula01.mostCurrent.activityBA,acformula01.mostCurrent,61);
if (RapidSub.canDelegate("etc_textchanged")) { return anetocalcV4.cerolab.acformula01.remoteMe.runUserSub(false, "acformula01","etc_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 61;BA.debugLine="Sub EtC_TextChanged (Old As String, New As String)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 62;BA.debugLine="If New = \"\" Or New=\".\" Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_new,BA.ObjectToString("")) || RemoteObject.solveBoolean("=",_new,BA.ObjectToString("."))) { 
 BA.debugLineNum = 63;BA.debugLine="C=0";
Debug.ShouldStop(1073741824);
acformula01._c = BA.numberCast(float.class, 0);
 }else {
 BA.debugLineNum = 65;BA.debugLine="C=New";
Debug.ShouldStop(1);
acformula01._c = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 67;BA.debugLine="LbResult.Text = clacula01";
Debug.ShouldStop(4);
acformula01.mostCurrent._lbresult.runMethod(true,"setText",BA.ObjectToCharSequence(_clacula01()));
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _etd_focuschanged(RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("EtD_FocusChanged (acformula01) ","acformula01",2,acformula01.mostCurrent.activityBA,acformula01.mostCurrent,135);
if (RapidSub.canDelegate("etd_focuschanged")) { return anetocalcV4.cerolab.acformula01.remoteMe.runUserSub(false, "acformula01","etd_focuschanged", _hasfocus);}
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 135;BA.debugLine="Sub EtD_FocusChanged (HasFocus As Boolean)";
Debug.ShouldStop(64);
 BA.debugLineNum = 136;BA.debugLine="If HasFocus Then EtD.Text=\"\"";
Debug.ShouldStop(128);
if (_hasfocus.<Boolean>get().booleanValue()) { 
acformula01.mostCurrent._etd.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));};
 BA.debugLineNum = 137;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _etd_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EtD_TextChanged (acformula01) ","acformula01",2,acformula01.mostCurrent.activityBA,acformula01.mostCurrent,70);
if (RapidSub.canDelegate("etd_textchanged")) { return anetocalcV4.cerolab.acformula01.remoteMe.runUserSub(false, "acformula01","etd_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 70;BA.debugLine="Sub EtD_TextChanged (Old As String, New As String)";
Debug.ShouldStop(32);
 BA.debugLineNum = 71;BA.debugLine="If New = \"\" Or New=\".\" Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_new,BA.ObjectToString("")) || RemoteObject.solveBoolean("=",_new,BA.ObjectToString("."))) { 
 BA.debugLineNum = 72;BA.debugLine="D=0";
Debug.ShouldStop(128);
acformula01._d = BA.numberCast(float.class, 0);
 }else {
 BA.debugLineNum = 74;BA.debugLine="D=New";
Debug.ShouldStop(512);
acformula01._d = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 76;BA.debugLine="LbResult.Text = clacula01";
Debug.ShouldStop(2048);
acformula01.mostCurrent._lbresult.runMethod(true,"setText",BA.ObjectToCharSequence(_clacula01()));
 BA.debugLineNum = 77;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
acformula01._a = RemoteObject.createImmutable(0f);
acformula01._b = RemoteObject.createImmutable(0f);
acformula01._c = RemoteObject.createImmutable(0f);
acformula01._d = BA.numberCast(float.class, 0);
 //BA.debugLineNum = 21;BA.debugLine="Private EtA As EditText";
acformula01.mostCurrent._eta = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private EtB As EditText";
acformula01.mostCurrent._etb = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private EtC As EditText";
acformula01.mostCurrent._etc = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private EtD As EditText";
acformula01.mostCurrent._etd = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private LbResult As Label";
acformula01.mostCurrent._lbresult = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private LbTitulo As Label";
acformula01.mostCurrent._lbtitulo = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 10;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}