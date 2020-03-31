package anetocalcV4.cerolab;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,42);
if (RapidSub.canDelegate("activity_create")) { return anetocalcV4.cerolab.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
RemoteObject _uid = RemoteObject.declareNull("b4a.example.cl_dguid");
RemoteObject _foto = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _texto = RemoteObject.createImmutable("");
RemoteObject _fotos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _textos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _f = 0;
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 42;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(512);
 BA.debugLineNum = 44;BA.debugLine="Activity.LoadLayout(\"main\")";
Debug.ShouldStop(2048);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("main")),main.mostCurrent.activityBA);
 BA.debugLineNum = 45;BA.debugLine="TabHost1.AddTab(\"CALCULADORA\", \"TabFormulas.bal\")";
Debug.ShouldStop(4096);
main.mostCurrent._tabhost1.runVoidMethodAndSync ("AddTab",main.mostCurrent.activityBA,(Object)(BA.ObjectToString("CALCULADORA")),(Object)(RemoteObject.createImmutable("TabFormulas.bal")));
 BA.debugLineNum = 46;BA.debugLine="TabHost1.AddTab(\"PRODUCTOS\", \"TabProductos.bal\")";
Debug.ShouldStop(8192);
main.mostCurrent._tabhost1.runVoidMethodAndSync ("AddTab",main.mostCurrent.activityBA,(Object)(BA.ObjectToString("PRODUCTOS")),(Object)(RemoteObject.createImmutable("TabProductos.bal")));
 BA.debugLineNum = 51;BA.debugLine="Dim uid As cl_dgUID";
Debug.ShouldStop(262144);
_uid = RemoteObject.createNew ("b4a.example.cl_dguid");Debug.locals.put("uid", _uid);
 BA.debugLineNum = 52;BA.debugLine="uid.Initialize";
Debug.ShouldStop(524288);
_uid.runVoidMethod ("_initialize",main.processBA);
 BA.debugLineNum = 53;BA.debugLine="Log(\"-------------- dgUID lib test -------------\"";
Debug.ShouldStop(1048576);
main.mostCurrent.__c.runVoidMethod ("LogImpl","2131083",RemoteObject.createImmutable("-------------- dgUID lib test -------------"),0);
 BA.debugLineNum = 54;BA.debugLine="Log(\"SDK: \"&uid.GetSDKInt)";
Debug.ShouldStop(2097152);
main.mostCurrent.__c.runVoidMethod ("LogImpl","2131084",RemoteObject.concat(RemoteObject.createImmutable("SDK: "),_uid.runMethod(true,"_getsdkint")),0);
 BA.debugLineNum = 55;BA.debugLine="Log(\"Android serial: \"&uid.GetAndroidSerial)";
Debug.ShouldStop(4194304);
main.mostCurrent.__c.runVoidMethod ("LogImpl","2131085",RemoteObject.concat(RemoteObject.createImmutable("Android serial: "),_uid.runMethod(true,"_getandroidserial")),0);
 BA.debugLineNum = 56;BA.debugLine="Log(\"Android ID: \"&uid.GetAndroidID)";
Debug.ShouldStop(8388608);
main.mostCurrent.__c.runVoidMethod ("LogImpl","2131086",RemoteObject.concat(RemoteObject.createImmutable("Android ID: "),_uid.runMethod(true,"_getandroidid")),0);
 BA.debugLineNum = 57;BA.debugLine="Log(\"Random UUID: \"&uid.GetRandomUUID)";
Debug.ShouldStop(16777216);
main.mostCurrent.__c.runVoidMethod ("LogImpl","2131087",RemoteObject.concat(RemoteObject.createImmutable("Random UUID: "),_uid.runMethod(true,"_getrandomuuid")),0);
 BA.debugLineNum = 58;BA.debugLine="Log(\"Gmail: \"&uid.GetGAccount) 'activate permissi";
Debug.ShouldStop(33554432);
main.mostCurrent.__c.runVoidMethod ("LogImpl","2131088",RemoteObject.concat(RemoteObject.createImmutable("Gmail: "),_uid.runMethod(true,"_getgaccount")),0);
 BA.debugLineNum = 67;BA.debugLine="Log(\"MyUID: \"&uid.MakeDGcode0(False,False))";
Debug.ShouldStop(4);
main.mostCurrent.__c.runVoidMethod ("LogImpl","2131097",RemoteObject.concat(RemoteObject.createImmutable("MyUID: "),_uid.runMethod(true,"_makedgcode0",(Object)(main.mostCurrent.__c.getField(true,"False")),(Object)(main.mostCurrent.__c.getField(true,"False")))),0);
 BA.debugLineNum = 72;BA.debugLine="DeviceId = uid.GetAndroidID";
Debug.ShouldStop(128);
main._deviceid = _uid.runMethod(true,"_getandroidid");
 BA.debugLineNum = 73;BA.debugLine="usrEmail = uid.GetGAccount";
Debug.ShouldStop(256);
main._usremail = _uid.runMethod(true,"_getgaccount");
 BA.debugLineNum = 75;BA.debugLine="GrabaAcceso		' grabar resitro en la tabla";
Debug.ShouldStop(1024);
_grabaacceso();
 BA.debugLineNum = 81;BA.debugLine="Dim foto As Bitmap";
Debug.ShouldStop(65536);
_foto = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("foto", _foto);
 BA.debugLineNum = 82;BA.debugLine="Dim texto As String";
Debug.ShouldStop(131072);
_texto = RemoteObject.createImmutable("");Debug.locals.put("texto", _texto);
 BA.debugLineNum = 84;BA.debugLine="Dim fotos As List";
Debug.ShouldStop(524288);
_fotos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("fotos", _fotos);
 BA.debugLineNum = 85;BA.debugLine="fotos.Initialize";
Debug.ShouldStop(1048576);
_fotos.runVoidMethod ("Initialize");
 BA.debugLineNum = 86;BA.debugLine="fotos.Add(\"film-industrial.jpg\")";
Debug.ShouldStop(2097152);
_fotos.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("film-industrial.jpg"))));
 BA.debugLineNum = 87;BA.debugLine="fotos.Add(\"Papel.jpg\")";
Debug.ShouldStop(4194304);
_fotos.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("Papel.jpg"))));
 BA.debugLineNum = 88;BA.debugLine="fotos.Add(\"burbuja.jpg\")";
Debug.ShouldStop(8388608);
_fotos.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("burbuja.jpg"))));
 BA.debugLineNum = 89;BA.debugLine="fotos.Add(\"precinto.jpg\")";
Debug.ShouldStop(16777216);
_fotos.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("precinto.jpg"))));
 BA.debugLineNum = 90;BA.debugLine="fotos.Add(\"carton-ondulado.jpg\")";
Debug.ShouldStop(33554432);
_fotos.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("carton-ondulado.jpg"))));
 BA.debugLineNum = 91;BA.debugLine="fotos.Add(\"cinta-impresa.jpg\")";
Debug.ShouldStop(67108864);
_fotos.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("cinta-impresa.jpg"))));
 BA.debugLineNum = 93;BA.debugLine="Dim textos As List";
Debug.ShouldStop(268435456);
_textos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("textos", _textos);
 BA.debugLineNum = 94;BA.debugLine="textos.Initialize";
Debug.ShouldStop(536870912);
_textos.runVoidMethod ("Initialize");
 BA.debugLineNum = 95;BA.debugLine="textos.Add(\"FILM ESTIRABLE\")";
Debug.ShouldStop(1073741824);
_textos.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("FILM ESTIRABLE"))));
 BA.debugLineNum = 96;BA.debugLine="textos.Add(\"Papel Kraft y alimentación\")";
Debug.ShouldStop(-2147483648);
_textos.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("Papel Kraft y alimentación"))));
 BA.debugLineNum = 97;BA.debugLine="textos.Add(\"Relleno y Protección\")";
Debug.ShouldStop(1);
_textos.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("Relleno y Protección"))));
 BA.debugLineNum = 98;BA.debugLine="textos.Add(\"Precinto\")";
Debug.ShouldStop(2);
_textos.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("Precinto"))));
 BA.debugLineNum = 99;BA.debugLine="textos.Add(\"Carton Ondulado\")";
Debug.ShouldStop(4);
_textos.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("Carton Ondulado"))));
 BA.debugLineNum = 100;BA.debugLine="textos.Add(\"Cinta adhesiva y precinto impreso\")";
Debug.ShouldStop(8);
_textos.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("Cinta adhesiva y precinto impreso"))));
 BA.debugLineNum = 102;BA.debugLine="For f=0 To 5";
Debug.ShouldStop(32);
{
final int step34 = 1;
final int limit34 = 5;
_f = 0 ;
for (;(step34 > 0 && _f <= limit34) || (step34 < 0 && _f >= limit34) ;_f = ((int)(0 + _f + step34))  ) {
Debug.locals.put("f", _f);
 BA.debugLineNum = 103;BA.debugLine="foto = LoadBitmapResize(File.DirAssets, fotos.Ge";
Debug.ShouldStop(64);
_foto = main.mostCurrent.__c.runMethod(false,"LoadBitmapResize",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString(_fotos.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _f))))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))),(Object)(main.mostCurrent.__c.getField(true,"True")));Debug.locals.put("foto", _foto);
 BA.debugLineNum = 104;BA.debugLine="texto=textos.Get(f)";
Debug.ShouldStop(128);
_texto = BA.ObjectToString(_textos.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _f))));Debug.locals.put("texto", _texto);
 BA.debugLineNum = 105;BA.debugLine="CLV1.Add(CreateItem(foto,texto) , \"\" )";
Debug.ShouldStop(256);
main.mostCurrent._clv1.runClassMethod (anetocalcV4.cerolab.customlistview.class, "_add" /*RemoteObject*/ ,(Object)(_createitem(_foto,_texto)),(Object)((RemoteObject.createImmutable(""))));
 }
}Debug.locals.put("f", _f);
;
 BA.debugLineNum = 113;BA.debugLine="Dim foto As Bitmap";
Debug.ShouldStop(65536);
_foto = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("foto", _foto);
 BA.debugLineNum = 114;BA.debugLine="Dim texto As String";
Debug.ShouldStop(131072);
_texto = RemoteObject.createImmutable("");Debug.locals.put("texto", _texto);
 BA.debugLineNum = 116;BA.debugLine="Dim fotos As List";
Debug.ShouldStop(524288);
_fotos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("fotos", _fotos);
 BA.debugLineNum = 117;BA.debugLine="fotos.Initialize";
Debug.ShouldStop(1048576);
_fotos.runVoidMethod ("Initialize");
 BA.debugLineNum = 118;BA.debugLine="fotos.Add(\"formula01.jpg\")";
Debug.ShouldStop(2097152);
_fotos.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("formula01.jpg"))));
 BA.debugLineNum = 119;BA.debugLine="fotos.Add(\"formula02.jpg\")";
Debug.ShouldStop(4194304);
_fotos.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("formula02.jpg"))));
 BA.debugLineNum = 120;BA.debugLine="fotos.Add(\"formula03.jpg\")";
Debug.ShouldStop(8388608);
_fotos.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("formula03.jpg"))));
 BA.debugLineNum = 121;BA.debugLine="fotos.Add(\"formula04.jpg\")";
Debug.ShouldStop(16777216);
_fotos.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("formula04.jpg"))));
 BA.debugLineNum = 123;BA.debugLine="Dim textos As List";
Debug.ShouldStop(67108864);
_textos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("textos", _textos);
 BA.debugLineNum = 124;BA.debugLine="textos.Initialize";
Debug.ShouldStop(134217728);
_textos.runVoidMethod ("Initialize");
 BA.debugLineNum = 125;BA.debugLine="textos.Add(\"Formato industrial - Calculo metros\")";
Debug.ShouldStop(268435456);
_textos.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("Formato industrial - Calculo metros"))));
 BA.debugLineNum = 126;BA.debugLine="textos.Add(\"Formato industrial - Cálculo Micras\")";
Debug.ShouldStop(536870912);
_textos.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("Formato industrial - Cálculo Micras"))));
 BA.debugLineNum = 127;BA.debugLine="textos.Add(\"Cálculo Preestiro\")";
Debug.ShouldStop(1073741824);
_textos.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("Cálculo Preestiro"))));
 BA.debugLineNum = 128;BA.debugLine="textos.Add(\"Peso Palet (Formatos más habituales)\"";
Debug.ShouldStop(-2147483648);
_textos.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("Peso Palet (Formatos más habituales)"))));
 BA.debugLineNum = 130;BA.debugLine="For f=0 To 3";
Debug.ShouldStop(2);
{
final int step53 = 1;
final int limit53 = 3;
_f = 0 ;
for (;(step53 > 0 && _f <= limit53) || (step53 < 0 && _f >= limit53) ;_f = ((int)(0 + _f + step53))  ) {
Debug.locals.put("f", _f);
 BA.debugLineNum = 131;BA.debugLine="foto = LoadBitmapResize(File.DirAssets, fotos.Ge";
Debug.ShouldStop(4);
_foto = main.mostCurrent.__c.runMethod(false,"LoadBitmapResize",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString(_fotos.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _f))))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))),(Object)(main.mostCurrent.__c.getField(true,"True")));Debug.locals.put("foto", _foto);
 BA.debugLineNum = 132;BA.debugLine="texto=textos.Get(f)";
Debug.ShouldStop(8);
_texto = BA.ObjectToString(_textos.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _f))));Debug.locals.put("texto", _texto);
 BA.debugLineNum = 133;BA.debugLine="CLV2.Add(CreateItem(foto,texto) , \"\" )";
Debug.ShouldStop(16);
main.mostCurrent._clv2.runClassMethod (anetocalcV4.cerolab.customlistview.class, "_add" /*RemoteObject*/ ,(Object)(_createitem(_foto,_texto)),(Object)((RemoteObject.createImmutable(""))));
 }
}Debug.locals.put("f", _f);
;
 BA.debugLineNum = 136;BA.debugLine="Activity.AddMenuItem(\"Salir\",\"fin\")";
Debug.ShouldStop(128);
main.mostCurrent._activity.runVoidMethod ("AddMenuItem",(Object)(BA.ObjectToCharSequence("Salir")),(Object)(RemoteObject.createImmutable("fin")));
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,159);
if (RapidSub.canDelegate("activity_pause")) { return anetocalcV4.cerolab.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 159;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 161;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,155);
if (RapidSub.canDelegate("activity_resume")) { return anetocalcV4.cerolab.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 155;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 157;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clv1_itemclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("CLV1_ItemClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,218);
if (RapidSub.canDelegate("clv1_itemclick")) { return anetocalcV4.cerolab.main.remoteMe.runUserSub(false, "main","clv1_itemclick", _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 218;BA.debugLine="Sub CLV1_ItemClick (Index As Int, Value As Object)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 219;BA.debugLine="Index = Index+1";
Debug.ShouldStop(67108864);
_index = RemoteObject.solve(new RemoteObject[] {_index,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("Index", _index);
 BA.debugLineNum = 220;BA.debugLine="If Index=1 Then OpenPdf(\"producto01.pdf\")";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_index,BA.numberCast(double.class, 1))) { 
_openpdf(RemoteObject.createImmutable("producto01.pdf"));};
 BA.debugLineNum = 221;BA.debugLine="If Index=2 Then OpenPdf(\"producto02.pdf\")";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_index,BA.numberCast(double.class, 2))) { 
_openpdf(RemoteObject.createImmutable("producto02.pdf"));};
 BA.debugLineNum = 222;BA.debugLine="If Index=3 Then OpenPdf(\"producto03.pdf\")";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_index,BA.numberCast(double.class, 3))) { 
_openpdf(RemoteObject.createImmutable("producto03.pdf"));};
 BA.debugLineNum = 223;BA.debugLine="If Index=4 Then OpenPdf(\"producto04.pdf\")";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_index,BA.numberCast(double.class, 4))) { 
_openpdf(RemoteObject.createImmutable("producto04.pdf"));};
 BA.debugLineNum = 224;BA.debugLine="CLV1.Refresh";
Debug.ShouldStop(-2147483648);
main.mostCurrent._clv1.runClassMethod (anetocalcV4.cerolab.customlistview.class, "_refresh" /*RemoteObject*/ );
 BA.debugLineNum = 225;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clv2_itemclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("CLV2_ItemClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,229);
if (RapidSub.canDelegate("clv2_itemclick")) { return anetocalcV4.cerolab.main.remoteMe.runUserSub(false, "main","clv2_itemclick", _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 229;BA.debugLine="Sub CLV2_ItemClick (Index As Int, Value As Object)";
Debug.ShouldStop(16);
 BA.debugLineNum = 230;BA.debugLine="Index = Index+1";
Debug.ShouldStop(32);
_index = RemoteObject.solve(new RemoteObject[] {_index,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("Index", _index);
 BA.debugLineNum = 231;BA.debugLine="If Index=1 Then StartActivity(\"AcFormula01\")";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_index,BA.numberCast(double.class, 1))) { 
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((RemoteObject.createImmutable("AcFormula01"))));};
 BA.debugLineNum = 232;BA.debugLine="If Index=2 Then StartActivity(\"AcFormula02\")";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_index,BA.numberCast(double.class, 2))) { 
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((RemoteObject.createImmutable("AcFormula02"))));};
 BA.debugLineNum = 233;BA.debugLine="If Index=3 Then StartActivity(\"AcFormula03\")";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_index,BA.numberCast(double.class, 3))) { 
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((RemoteObject.createImmutable("AcFormula03"))));};
 BA.debugLineNum = 234;BA.debugLine="If Index=4 Then OpenPdf(\"medidaspalet.pdf\")";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_index,BA.numberCast(double.class, 4))) { 
_openpdf(RemoteObject.createImmutable("medidaspalet.pdf"));};
 BA.debugLineNum = 235;BA.debugLine="CLV2.Refresh";
Debug.ShouldStop(1024);
main.mostCurrent._clv2.runClassMethod (anetocalcV4.cerolab.customlistview.class, "_refresh" /*RemoteObject*/ );
 BA.debugLineNum = 236;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createitem(RemoteObject _img,RemoteObject _descripcion) throws Exception{
try {
		Debug.PushSubsStack("CreateItem (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,139);
if (RapidSub.canDelegate("createitem")) { return anetocalcV4.cerolab.main.remoteMe.runUserSub(false, "main","createitem", _img, _descripcion);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("img", _img);
Debug.locals.put("descripcion", _descripcion);
 BA.debugLineNum = 139;BA.debugLine="private Sub CreateItem(img As Bitmap, descripcion";
Debug.ShouldStop(1024);
 BA.debugLineNum = 140;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(2048);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = main._xui.runMethod(false,"CreatePanel",main.processBA,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 141;BA.debugLine="p.SetLayoutAnimated(0,0,0,93%x, 120dip)";
Debug.ShouldStop(4096);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 93)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 120)))));
 BA.debugLineNum = 142;BA.debugLine="p.LoadLayout(\"LyProd\")";
Debug.ShouldStop(8192);
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("LyProd")),main.mostCurrent.activityBA);
 BA.debugLineNum = 143;BA.debugLine="IvFoto.Bitmap=img";
Debug.ShouldStop(16384);
main.mostCurrent._ivfoto.runMethod(false,"setBitmap",(_img.getObject()));
 BA.debugLineNum = 144;BA.debugLine="LbDescrip.Text=descripcion";
Debug.ShouldStop(32768);
main.mostCurrent._lbdescrip.runMethod(true,"setText",BA.ObjectToCharSequence(_descripcion));
 BA.debugLineNum = 145;BA.debugLine="Return p";
Debug.ShouldStop(65536);
if (true) return _p;
 BA.debugLineNum = 146;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fin_click() throws Exception{
try {
		Debug.PushSubsStack("fin_click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,148);
if (RapidSub.canDelegate("fin_click")) { return anetocalcV4.cerolab.main.remoteMe.runUserSub(false, "main","fin_click");}
 BA.debugLineNum = 148;BA.debugLine="private Sub fin_click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 149;BA.debugLine="Log(\"SALIR\")";
Debug.ShouldStop(1048576);
main.mostCurrent.__c.runVoidMethod ("LogImpl","2786433",RemoteObject.createImmutable("SALIR"),0);
 BA.debugLineNum = 150;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 32;BA.debugLine="Private LbTitulo As Label";
main.mostCurrent._lbtitulo = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private TabHost1 As TabHost";
main.mostCurrent._tabhost1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.TabHostWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private BtContacto As Button";
main.mostCurrent._btcontacto = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private CLV1 As CustomListView	'productos";
main.mostCurrent._clv1 = RemoteObject.createNew ("anetocalcV4.cerolab.customlistview");
 //BA.debugLineNum = 37;BA.debugLine="Public  CLV2 As CustomListView	'Formulas";
main.mostCurrent._clv2 = RemoteObject.createNew ("anetocalcV4.cerolab.customlistview");
 //BA.debugLineNum = 38;BA.debugLine="Private IvFoto As ImageView";
main.mostCurrent._ivfoto = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private LbDescrip As Label";
main.mostCurrent._lbdescrip = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _grabaacceso() throws Exception{
try {
		Debug.PushSubsStack("GrabaAcceso (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,171);
if (RapidSub.canDelegate("grabaacceso")) { return anetocalcV4.cerolab.main.remoteMe.runUserSub(false, "main","grabaacceso");}
RemoteObject _insertacceso = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");
 BA.debugLineNum = 171;BA.debugLine="Sub GrabaAcceso As String";
Debug.ShouldStop(1024);
 BA.debugLineNum = 172;BA.debugLine="Try";
Debug.ShouldStop(2048);
try { BA.debugLineNum = 173;BA.debugLine="Dim InsertAcceso As HttpJob";
Debug.ShouldStop(4096);
_insertacceso = RemoteObject.createNew ("anywheresoftware.b4a.samples.httputils2.httpjob");Debug.locals.put("InsertAcceso", _insertacceso);
 BA.debugLineNum = 174;BA.debugLine="InsertAcceso.Initialize(\"InsertAc\", Me)";
Debug.ShouldStop(8192);
_insertacceso.runVoidMethod ("_initialize",main.processBA,(Object)(BA.ObjectToString("InsertAc")),(Object)(main.getObject()));
 BA.debugLineNum = 175;BA.debugLine="InsertAcceso.download2(\"http://cerolab.com/proye";
Debug.ShouldStop(16384);
_insertacceso.runVoidMethod ("_download2",(Object)(BA.ObjectToString("http://cerolab.com/proyectos/aneto/x_accesos.php")),(Object)(RemoteObject.createNewArray("String",new int[] {6},new Object[] {BA.ObjectToString("action"),BA.ObjectToString("InsertAcceso"),BA.ObjectToString("id_dispositivo"),main._deviceid,BA.ObjectToString("email"),main._usremail})));
 BA.debugLineNum = 176;BA.debugLine="Return (\"Ok\")";
Debug.ShouldStop(32768);
Debug.CheckDeviceExceptions();if (true) return (RemoteObject.createImmutable("Ok"));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e7) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e7.toString()); BA.debugLineNum = 178;BA.debugLine="Log(LastException.Message)";
Debug.ShouldStop(131072);
main.mostCurrent.__c.runVoidMethod ("LogImpl","2851975",main.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA).runMethod(true,"getMessage"),0);
 BA.debugLineNum = 179;BA.debugLine="Return (\"Error:\" & LastException.Message)";
Debug.ShouldStop(262144);
if (true) return (RemoteObject.concat(RemoteObject.createImmutable("Error:"),main.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA).runMethod(true,"getMessage")));
 };
 BA.debugLineNum = 181;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,186);
if (RapidSub.canDelegate("jobdone")) { return anetocalcV4.cerolab.main.remoteMe.runUserSub(false, "main","jobdone", _job);}
RemoteObject _res = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 186;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 187;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(67108864);
main.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 188;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(134217728);
if (_job.getField(true,"_success").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 189;BA.debugLine="Dim res As String";
Debug.ShouldStop(268435456);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 190;BA.debugLine="res = Job.GetString";
Debug.ShouldStop(536870912);
_res = _job.runMethod(true,"_getstring");Debug.locals.put("res", _res);
 BA.debugLineNum = 191;BA.debugLine="Log(\"Back from Job:\" & Job.JobName )";
Debug.ShouldStop(1073741824);
main.mostCurrent.__c.runVoidMethod ("LogImpl","2917509",RemoteObject.concat(RemoteObject.createImmutable("Back from Job:"),_job.getField(true,"_jobname")),0);
 BA.debugLineNum = 192;BA.debugLine="Log(\"Response from server: \" & res)";
Debug.ShouldStop(-2147483648);
main.mostCurrent.__c.runVoidMethod ("LogImpl","2917510",RemoteObject.concat(RemoteObject.createImmutable("Response from server: "),_res),0);
 BA.debugLineNum = 194;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(2);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 195;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(4);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 197;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(16);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname"),BA.ObjectToString("CountP"),BA.ObjectToString("InsertAc"))) {
case 0: {
 break; }
case 1: {
 break; }
}
;
 }else {
 BA.debugLineNum = 210;BA.debugLine="ToastMessageShow(\"Error: \" & Job.ErrorMessage, T";
Debug.ShouldStop(131072);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage")))),(Object)(main.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 212;BA.debugLine="Job.Release";
Debug.ShouldStop(524288);
_job.runVoidMethod ("_release");
 BA.debugLineNum = 213;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _openpdf(RemoteObject _fichero) throws Exception{
try {
		Debug.PushSubsStack("OpenPdf (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,240);
if (RapidSub.canDelegate("openpdf")) { return anetocalcV4.cerolab.main.remoteMe.runUserSub(false, "main","openpdf", _fichero);}
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _in = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
Debug.locals.put("fichero", _fichero);
 BA.debugLineNum = 240;BA.debugLine="Sub OpenPdf(fichero As String)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 241;BA.debugLine="Try";
Debug.ShouldStop(65536);
try { BA.debugLineNum = 243;BA.debugLine="Log(\"OpenPdf:\"&fichero)";
Debug.ShouldStop(262144);
main.mostCurrent.__c.runVoidMethod ("LogImpl","21114115",RemoteObject.concat(RemoteObject.createImmutable("OpenPdf:"),_fichero),0);
 BA.debugLineNum = 244;BA.debugLine="Dim FileName As String = fichero";
Debug.ShouldStop(524288);
_filename = _fichero;Debug.locals.put("FileName", _filename);Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 250;BA.debugLine="File.Copy(File.DirAssets, FileName, Starter.Prov";
Debug.ShouldStop(33554432);
main.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(_filename),(Object)(main.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_filename));
 BA.debugLineNum = 251;BA.debugLine="Dim in As Intent";
Debug.ShouldStop(67108864);
_in = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");Debug.locals.put("in", _in);
 BA.debugLineNum = 252;BA.debugLine="in.Initialize(in.ACTION_VIEW, \"\")";
Debug.ShouldStop(134217728);
_in.runVoidMethod ("Initialize",(Object)(_in.getField(true,"ACTION_VIEW")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 253;BA.debugLine="Starter.Provider.SetFileUriAsIntentData(in, File";
Debug.ShouldStop(268435456);
main.mostCurrent._starter._provider /*RemoteObject*/ .runClassMethod (anetocalcV4.cerolab.fileprovider.class, "_setfileuriasintentdata" /*RemoteObject*/ ,(Object)(_in),(Object)(_filename));
 BA.debugLineNum = 255;BA.debugLine="in.SetType(\"application/pdf\")";
Debug.ShouldStop(1073741824);
_in.runVoidMethod ("SetType",(Object)(RemoteObject.createImmutable("application/pdf")));
 BA.debugLineNum = 256;BA.debugLine="StartActivity(in)";
Debug.ShouldStop(-2147483648);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((_in.getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e11) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e11.toString()); BA.debugLineNum = 311;BA.debugLine="Log(LastException.Message)";
Debug.ShouldStop(4194304);
main.mostCurrent.__c.runVoidMethod ("LogImpl","21114183",main.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA).runMethod(true,"getMessage"),0);
 };
 BA.debugLineNum = 314;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
acformula01_subs_0._process_globals();
acformula02_subs_0._process_globals();
acformula03_subs_0._process_globals();
formulas_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("anetocalcV4.cerolab.main");
starter.myClass = BA.getDeviceClass ("anetocalcV4.cerolab.starter");
acformula01.myClass = BA.getDeviceClass ("anetocalcV4.cerolab.acformula01");
acformula02.myClass = BA.getDeviceClass ("anetocalcV4.cerolab.acformula02");
acformula03.myClass = BA.getDeviceClass ("anetocalcV4.cerolab.acformula03");
customlistview.myClass = BA.getDeviceClass ("anetocalcV4.cerolab.customlistview");
fileprovider.myClass = BA.getDeviceClass ("anetocalcV4.cerolab.fileprovider");
formulas.myClass = BA.getDeviceClass ("anetocalcV4.cerolab.formulas");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 23;BA.debugLine="Private xui As XUI";
main._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 24;BA.debugLine="Dim usrEmail As String";
main._usremail = RemoteObject.createImmutable("");
 //BA.debugLineNum = 25;BA.debugLine="Dim DeviceId As String";
main._deviceid = RemoteObject.createImmutable("");
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}