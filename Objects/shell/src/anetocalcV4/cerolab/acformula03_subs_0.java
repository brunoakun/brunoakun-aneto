package anetocalcV4.cerolab;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class acformula03_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (acformula03) ","acformula03",4,acformula03.mostCurrent.activityBA,acformula03.mostCurrent,32);
if (RapidSub.canDelegate("activity_create")) { return anetocalcV4.cerolab.acformula03.remoteMe.runUserSub(false, "acformula03","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 32;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 35;BA.debugLine="Activity.LoadLayout(\"LyFormula03\")";
Debug.ShouldStop(4);
acformula03.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("LyFormula03")),acformula03.mostCurrent.activityBA);
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("Activity_Pause (acformula03) ","acformula03",4,acformula03.mostCurrent.activityBA,acformula03.mostCurrent,99);
if (RapidSub.canDelegate("activity_pause")) { return anetocalcV4.cerolab.acformula03.remoteMe.runUserSub(false, "acformula03","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 99;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4);
 BA.debugLineNum = 100;BA.debugLine="Log(\"Formula03 Activity_Pause\")";
Debug.ShouldStop(8);
acformula03.mostCurrent.__c.runVoidMethod ("LogImpl","23473409",RemoteObject.createImmutable("Formula03 Activity_Pause"),0);
 BA.debugLineNum = 101;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("Activity_Resume (acformula03) ","acformula03",4,acformula03.mostCurrent.activityBA,acformula03.mostCurrent,95);
if (RapidSub.canDelegate("activity_resume")) { return anetocalcV4.cerolab.acformula03.remoteMe.runUserSub(false, "acformula03","activity_resume");}
 BA.debugLineNum = 95;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 96;BA.debugLine="Log(\"Formula03 Activity_Resume\")";
Debug.ShouldStop(-2147483648);
acformula03.mostCurrent.__c.runVoidMethod ("LogImpl","23407873",RemoteObject.createImmutable("Formula03 Activity_Resume"),0);
 BA.debugLineNum = 97;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("clacula01 (acformula03) ","acformula03",4,acformula03.mostCurrent.activityBA,acformula03.mostCurrent,105);
if (RapidSub.canDelegate("clacula01")) { return anetocalcV4.cerolab.acformula03.remoteMe.runUserSub(false, "acformula03","clacula01");}
RemoteObject _cal = RemoteObject.createImmutable(0f);
 BA.debugLineNum = 105;BA.debugLine="Sub clacula01 As String";
Debug.ShouldStop(256);
 BA.debugLineNum = 110;BA.debugLine="Dim cal As Float";
Debug.ShouldStop(8192);
_cal = RemoteObject.createImmutable(0f);Debug.locals.put("cal", _cal);
 BA.debugLineNum = 113;BA.debugLine="If B > 9999 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(">",acformula03._b,BA.numberCast(double.class, 9999))) { 
 BA.debugLineNum = 114;BA.debugLine="B=9999";
Debug.ShouldStop(131072);
acformula03._b = BA.numberCast(float.class, 9999);
 BA.debugLineNum = 115;BA.debugLine="EtB.Text=B";
Debug.ShouldStop(262144);
acformula03.mostCurrent._etb.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(acformula03._b));
 };
 BA.debugLineNum = 118;BA.debugLine="If A=0 And B=0 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",acformula03._a,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("=",acformula03._b,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 119;BA.debugLine="Return(0)";
Debug.ShouldStop(4194304);
if (true) return BA.NumberToString((0));
 };
 BA.debugLineNum = 123;BA.debugLine="LbResultPalet.Text = claculaG";
Debug.ShouldStop(67108864);
acformula03.mostCurrent._lbresultpalet.runMethod(true,"setText",BA.ObjectToCharSequence(_claculag()));
 BA.debugLineNum = 125;BA.debugLine="Log(\"VALORES: A=\"&A&\"B=\"&B&\"C=\"&C&\"D=\"&D&\"E=\"&E&\"";
Debug.ShouldStop(268435456);
acformula03.mostCurrent.__c.runVoidMethod ("LogImpl","23538964",RemoteObject.concat(RemoteObject.createImmutable("VALORES: A="),acformula03._a,RemoteObject.createImmutable("B="),acformula03._b,RemoteObject.createImmutable("C="),acformula03._c,RemoteObject.createImmutable("D="),acformula03._d,RemoteObject.createImmutable("E="),acformula03._e,RemoteObject.createImmutable("F="),acformula03._f,RemoteObject.createImmutable("G="),acformula03._g),0);
 BA.debugLineNum = 127;BA.debugLine="If E=0 Then Return(\"0.00\")	' Evitar dividir x 0";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",acformula03._e,BA.numberCast(double.class, 0))) { 
if (true) return (RemoteObject.createImmutable("0.00"));};
 BA.debugLineNum = 129;BA.debugLine="cal=(((G*C*D*F*0.92)/E)-1)*100";
Debug.ShouldStop(1);
_cal = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {acformula03._g,acformula03._c,acformula03._d,acformula03._f,RemoteObject.createImmutable(0.92)}, "****",0, 0)),acformula03._e}, "/",0, 0)),RemoteObject.createImmutable(1)}, "-",1, 0)),RemoteObject.createImmutable(100)}, "*",0, 0));Debug.locals.put("cal", _cal);
 BA.debugLineNum = 130;BA.debugLine="cal=cal+0";
Debug.ShouldStop(2);
_cal = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_cal,RemoteObject.createImmutable(0)}, "+",1, 0));Debug.locals.put("cal", _cal);
 BA.debugLineNum = 131;BA.debugLine="Log(\"calculo=\" & cal)";
Debug.ShouldStop(4);
acformula03.mostCurrent.__c.runVoidMethod ("LogImpl","23538970",RemoteObject.concat(RemoteObject.createImmutable("calculo="),_cal),0);
 BA.debugLineNum = 133;BA.debugLine="If cal=\"-Infinity\" Or cal=\"Infinity\" Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_cal,BA.numberCast(double.class, "-Infinity")) || RemoteObject.solveBoolean("=",_cal,BA.numberCast(double.class, "Infinity"))) { 
 BA.debugLineNum = 134;BA.debugLine="Return(\"0.00\")";
Debug.ShouldStop(32);
if (true) return (RemoteObject.createImmutable("0.00"));
 };
 BA.debugLineNum = 137;BA.debugLine="Return(NumberFormat2(cal,1,2,2,True))";
Debug.ShouldStop(256);
if (true) return (acformula03.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, _cal)),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 2)),(Object)(acformula03.mostCurrent.__c.getField(true,"True"))));
 BA.debugLineNum = 138;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _claculag() throws Exception{
try {
		Debug.PushSubsStack("claculaG (acformula03) ","acformula03",4,acformula03.mostCurrent.activityBA,acformula03.mostCurrent,141);
if (RapidSub.canDelegate("claculag")) { return anetocalcV4.cerolab.acformula03.remoteMe.runUserSub(false, "acformula03","claculag");}
 BA.debugLineNum = 141;BA.debugLine="Sub claculaG As String";
Debug.ShouldStop(4096);
 BA.debugLineNum = 142;BA.debugLine="G=((A/100)+(B/100))*2";
Debug.ShouldStop(8192);
acformula03._g = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {acformula03._a,RemoteObject.createImmutable(100)}, "/",0, 0)),(RemoteObject.solve(new RemoteObject[] {acformula03._b,RemoteObject.createImmutable(100)}, "/",0, 0))}, "+",1, 0)),RemoteObject.createImmutable(2)}, "*",0, 0));
 BA.debugLineNum = 143;BA.debugLine="If IsNumber(G)=False Or G=\"-Infinity\" Or G=\"Infin";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",acformula03.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(BA.NumberToString(acformula03._g))),acformula03.mostCurrent.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",acformula03._g,BA.numberCast(double.class, "-Infinity")) || RemoteObject.solveBoolean("=",acformula03._g,BA.numberCast(double.class, "Infinity"))) { 
 BA.debugLineNum = 144;BA.debugLine="Return(\"0\")";
Debug.ShouldStop(32768);
if (true) return (RemoteObject.createImmutable("0"));
 };
 BA.debugLineNum = 147;BA.debugLine="Return(NumberFormat2(G,1,1,1,True))";
Debug.ShouldStop(262144);
if (true) return (acformula03.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, acformula03._g)),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 1)),(Object)(acformula03.mostCurrent.__c.getField(true,"True"))));
 BA.debugLineNum = 148;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("EtA_FocusChanged (acformula03) ","acformula03",4,acformula03.mostCurrent.activityBA,acformula03.mostCurrent,151);
if (RapidSub.canDelegate("eta_focuschanged")) { return anetocalcV4.cerolab.acformula03.remoteMe.runUserSub(false, "acformula03","eta_focuschanged", _hasfocus);}
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 151;BA.debugLine="Sub EtA_FocusChanged (HasFocus As Boolean)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 152;BA.debugLine="If HasFocus Then EtA.Text=\"\"";
Debug.ShouldStop(8388608);
if (_hasfocus.<Boolean>get().booleanValue()) { 
acformula03.mostCurrent._eta.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));};
 BA.debugLineNum = 153;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("EtA_TextChanged (acformula03) ","acformula03",4,acformula03.mostCurrent.activityBA,acformula03.mostCurrent,40);
if (RapidSub.canDelegate("eta_textchanged")) { return anetocalcV4.cerolab.acformula03.remoteMe.runUserSub(false, "acformula03","eta_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 40;BA.debugLine="Sub EtA_TextChanged (Old As String, New As String)";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="If New = \"\" Or New=\".\" Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_new,BA.ObjectToString("")) || RemoteObject.solveBoolean("=",_new,BA.ObjectToString("."))) { 
 BA.debugLineNum = 42;BA.debugLine="A=0";
Debug.ShouldStop(512);
acformula03._a = BA.numberCast(float.class, 0);
 }else {
 BA.debugLineNum = 44;BA.debugLine="A=New";
Debug.ShouldStop(2048);
acformula03._a = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 46;BA.debugLine="LbResult.Text = clacula01";
Debug.ShouldStop(8192);
acformula03.mostCurrent._lbresult.runMethod(true,"setText",BA.ObjectToCharSequence(_clacula01()));
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("EtB_FocusChanged (acformula03) ","acformula03",4,acformula03.mostCurrent.activityBA,acformula03.mostCurrent,154);
if (RapidSub.canDelegate("etb_focuschanged")) { return anetocalcV4.cerolab.acformula03.remoteMe.runUserSub(false, "acformula03","etb_focuschanged", _hasfocus);}
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 154;BA.debugLine="Sub EtB_FocusChanged (HasFocus As Boolean)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 155;BA.debugLine="If HasFocus Then EtB.Text=\"\"";
Debug.ShouldStop(67108864);
if (_hasfocus.<Boolean>get().booleanValue()) { 
acformula03.mostCurrent._etb.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));};
 BA.debugLineNum = 156;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("EtB_TextChanged (acformula03) ","acformula03",4,acformula03.mostCurrent.activityBA,acformula03.mostCurrent,49);
if (RapidSub.canDelegate("etb_textchanged")) { return anetocalcV4.cerolab.acformula03.remoteMe.runUserSub(false, "acformula03","etb_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 49;BA.debugLine="Sub EtB_TextChanged (Old As String, New As String)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 50;BA.debugLine="If New = \"\" Or New=\".\" Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_new,BA.ObjectToString("")) || RemoteObject.solveBoolean("=",_new,BA.ObjectToString("."))) { 
 BA.debugLineNum = 51;BA.debugLine="B=0";
Debug.ShouldStop(262144);
acformula03._b = BA.numberCast(float.class, 0);
 }else {
 BA.debugLineNum = 53;BA.debugLine="B=New";
Debug.ShouldStop(1048576);
acformula03._b = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 55;BA.debugLine="LbResult.Text = clacula01";
Debug.ShouldStop(4194304);
acformula03.mostCurrent._lbresult.runMethod(true,"setText",BA.ObjectToCharSequence(_clacula01()));
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
public static RemoteObject  _etc_focuschanged(RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("EtC_FocusChanged (acformula03) ","acformula03",4,acformula03.mostCurrent.activityBA,acformula03.mostCurrent,157);
if (RapidSub.canDelegate("etc_focuschanged")) { return anetocalcV4.cerolab.acformula03.remoteMe.runUserSub(false, "acformula03","etc_focuschanged", _hasfocus);}
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 157;BA.debugLine="Sub EtC_FocusChanged (HasFocus As Boolean)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 158;BA.debugLine="If HasFocus Then EtC.Text=\"\"";
Debug.ShouldStop(536870912);
if (_hasfocus.<Boolean>get().booleanValue()) { 
acformula03.mostCurrent._etc.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));};
 BA.debugLineNum = 159;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("EtC_TextChanged (acformula03) ","acformula03",4,acformula03.mostCurrent.activityBA,acformula03.mostCurrent,58);
if (RapidSub.canDelegate("etc_textchanged")) { return anetocalcV4.cerolab.acformula03.remoteMe.runUserSub(false, "acformula03","etc_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 58;BA.debugLine="Sub EtC_TextChanged (Old As String, New As String)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 59;BA.debugLine="If New = \"\" Or New=\".\" Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_new,BA.ObjectToString("")) || RemoteObject.solveBoolean("=",_new,BA.ObjectToString("."))) { 
 BA.debugLineNum = 60;BA.debugLine="C=0";
Debug.ShouldStop(134217728);
acformula03._c = BA.numberCast(float.class, 0);
 }else {
 BA.debugLineNum = 62;BA.debugLine="C=New";
Debug.ShouldStop(536870912);
acformula03._c = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 64;BA.debugLine="LbResult.Text = clacula01";
Debug.ShouldStop(-2147483648);
acformula03.mostCurrent._lbresult.runMethod(true,"setText",BA.ObjectToCharSequence(_clacula01()));
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("EtD_FocusChanged (acformula03) ","acformula03",4,acformula03.mostCurrent.activityBA,acformula03.mostCurrent,160);
if (RapidSub.canDelegate("etd_focuschanged")) { return anetocalcV4.cerolab.acformula03.remoteMe.runUserSub(false, "acformula03","etd_focuschanged", _hasfocus);}
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 160;BA.debugLine="Sub EtD_FocusChanged (HasFocus As Boolean)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 161;BA.debugLine="If HasFocus Then EtD.Text=\"\"";
Debug.ShouldStop(1);
if (_hasfocus.<Boolean>get().booleanValue()) { 
acformula03.mostCurrent._etd.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));};
 BA.debugLineNum = 162;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("EtD_TextChanged (acformula03) ","acformula03",4,acformula03.mostCurrent.activityBA,acformula03.mostCurrent,67);
if (RapidSub.canDelegate("etd_textchanged")) { return anetocalcV4.cerolab.acformula03.remoteMe.runUserSub(false, "acformula03","etd_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 67;BA.debugLine="Sub EtD_TextChanged (Old As String, New As String)";
Debug.ShouldStop(4);
 BA.debugLineNum = 68;BA.debugLine="If New = \"\" Or New=\".\" Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_new,BA.ObjectToString("")) || RemoteObject.solveBoolean("=",_new,BA.ObjectToString("."))) { 
 BA.debugLineNum = 69;BA.debugLine="D=0";
Debug.ShouldStop(16);
acformula03._d = BA.numberCast(float.class, 0);
 }else {
 BA.debugLineNum = 71;BA.debugLine="D=New";
Debug.ShouldStop(64);
acformula03._d = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 73;BA.debugLine="LbResult.Text = clacula01";
Debug.ShouldStop(256);
acformula03.mostCurrent._lbresult.runMethod(true,"setText",BA.ObjectToCharSequence(_clacula01()));
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ete_focuschanged(RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("EtE_FocusChanged (acformula03) ","acformula03",4,acformula03.mostCurrent.activityBA,acformula03.mostCurrent,163);
if (RapidSub.canDelegate("ete_focuschanged")) { return anetocalcV4.cerolab.acformula03.remoteMe.runUserSub(false, "acformula03","ete_focuschanged", _hasfocus);}
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 163;BA.debugLine="Sub EtE_FocusChanged (HasFocus As Boolean)";
Debug.ShouldStop(4);
 BA.debugLineNum = 164;BA.debugLine="If HasFocus Then EtE.Text=\"\"";
Debug.ShouldStop(8);
if (_hasfocus.<Boolean>get().booleanValue()) { 
acformula03.mostCurrent._ete.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));};
 BA.debugLineNum = 165;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ete_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EtE_TextChanged (acformula03) ","acformula03",4,acformula03.mostCurrent.activityBA,acformula03.mostCurrent,76);
if (RapidSub.canDelegate("ete_textchanged")) { return anetocalcV4.cerolab.acformula03.remoteMe.runUserSub(false, "acformula03","ete_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 76;BA.debugLine="Sub EtE_TextChanged (Old As String, New As String)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 77;BA.debugLine="If New = \"\" Or New=\".\" Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_new,BA.ObjectToString("")) || RemoteObject.solveBoolean("=",_new,BA.ObjectToString("."))) { 
 BA.debugLineNum = 78;BA.debugLine="E=0";
Debug.ShouldStop(8192);
acformula03._e = BA.numberCast(float.class, 0);
 }else {
 BA.debugLineNum = 80;BA.debugLine="E=New";
Debug.ShouldStop(32768);
acformula03._e = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 82;BA.debugLine="LbResult.Text = clacula01";
Debug.ShouldStop(131072);
acformula03.mostCurrent._lbresult.runMethod(true,"setText",BA.ObjectToCharSequence(_clacula01()));
 BA.debugLineNum = 83;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _etf_focuschanged(RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("EtF_FocusChanged (acformula03) ","acformula03",4,acformula03.mostCurrent.activityBA,acformula03.mostCurrent,166);
if (RapidSub.canDelegate("etf_focuschanged")) { return anetocalcV4.cerolab.acformula03.remoteMe.runUserSub(false, "acformula03","etf_focuschanged", _hasfocus);}
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 166;BA.debugLine="Sub EtF_FocusChanged (HasFocus As Boolean)";
Debug.ShouldStop(32);
 BA.debugLineNum = 167;BA.debugLine="If HasFocus Then EtF.Text=\"\"";
Debug.ShouldStop(64);
if (_hasfocus.<Boolean>get().booleanValue()) { 
acformula03.mostCurrent._etf.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));};
 BA.debugLineNum = 168;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _etf_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EtF_TextChanged (acformula03) ","acformula03",4,acformula03.mostCurrent.activityBA,acformula03.mostCurrent,85);
if (RapidSub.canDelegate("etf_textchanged")) { return anetocalcV4.cerolab.acformula03.remoteMe.runUserSub(false, "acformula03","etf_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 85;BA.debugLine="Sub EtF_TextChanged (Old As String, New As String)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 86;BA.debugLine="If New = \"\" Or New=\".\" Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_new,BA.ObjectToString("")) || RemoteObject.solveBoolean("=",_new,BA.ObjectToString("."))) { 
 BA.debugLineNum = 87;BA.debugLine="F=0";
Debug.ShouldStop(4194304);
acformula03._f = BA.numberCast(float.class, 0);
 }else {
 BA.debugLineNum = 89;BA.debugLine="F=New";
Debug.ShouldStop(16777216);
acformula03._f = BA.numberCast(float.class, _new);
 };
 BA.debugLineNum = 91;BA.debugLine="LbResult.Text = clacula01";
Debug.ShouldStop(67108864);
acformula03.mostCurrent._lbresult.runMethod(true,"setText",BA.ObjectToCharSequence(_clacula01()));
 BA.debugLineNum = 92;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
 //BA.debugLineNum = 19;BA.debugLine="Public A,B,C,D,E,F,G As Float = 0";
acformula03._a = RemoteObject.createImmutable(0f);
acformula03._b = RemoteObject.createImmutable(0f);
acformula03._c = RemoteObject.createImmutable(0f);
acformula03._d = RemoteObject.createImmutable(0f);
acformula03._e = RemoteObject.createImmutable(0f);
acformula03._f = RemoteObject.createImmutable(0f);
acformula03._g = BA.numberCast(float.class, 0);
 //BA.debugLineNum = 21;BA.debugLine="Private EtA As EditText";
acformula03.mostCurrent._eta = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private EtB As EditText";
acformula03.mostCurrent._etb = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private EtC As EditText";
acformula03.mostCurrent._etc = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private EtD As EditText";
acformula03.mostCurrent._etd = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private EtE As EditText";
acformula03.mostCurrent._ete = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private EtF As EditText";
acformula03.mostCurrent._etf = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private LbResultPalet As Label";
acformula03.mostCurrent._lbresultpalet = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private LbResult As Label";
acformula03.mostCurrent._lbresult = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 10;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}