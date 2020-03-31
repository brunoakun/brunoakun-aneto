package anetocalcV4.cerolab.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_lyejemploanchobotones{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
String _gap="";
String _ancho="";
//BA.debugLineNum = 2;BA.debugLine="AutoScaleAll"[LyEjemploAnchoBotones/General script]
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
//BA.debugLineNum = 4;BA.debugLine="gap = 10dip	'Espacio en tre botones"[LyEjemploAnchoBotones/General script]
_gap = BA.NumberToString((10d * scale));
//BA.debugLineNum = 5;BA.debugLine="ancho = ((Panel1.Width) / 2 )-gap	' ancho del panel / Nº de botones por línea"[LyEjemploAnchoBotones/General script]
_ancho = BA.NumberToString((((views.get("panel1").vw.getWidth()))/2d)-Double.parseDouble(_gap));
//BA.debugLineNum = 7;BA.debugLine="BtCalcMetros.left = gap"[LyEjemploAnchoBotones/General script]
views.get("btcalcmetros").vw.setLeft((int)(Double.parseDouble(_gap)));
//BA.debugLineNum = 8;BA.debugLine="BtCalcMetros.Width= ancho"[LyEjemploAnchoBotones/General script]
views.get("btcalcmetros").vw.setWidth((int)(Double.parseDouble(_ancho)));
//BA.debugLineNum = 10;BA.debugLine="BtCalcMicras.left = gap+BtCalcMetros.Width"[LyEjemploAnchoBotones/General script]
views.get("btcalcmicras").vw.setLeft((int)(Double.parseDouble(_gap)+(views.get("btcalcmetros").vw.getWidth())));
//BA.debugLineNum = 11;BA.debugLine="BtCalcMicras.Width= ancho"[LyEjemploAnchoBotones/General script]
views.get("btcalcmicras").vw.setWidth((int)(Double.parseDouble(_ancho)));
//BA.debugLineNum = 13;BA.debugLine="BtCalcPreestiro.left = gap"[LyEjemploAnchoBotones/General script]
views.get("btcalcpreestiro").vw.setLeft((int)(Double.parseDouble(_gap)));
//BA.debugLineNum = 14;BA.debugLine="BtCalcPreestiro.Width=ancho"[LyEjemploAnchoBotones/General script]
views.get("btcalcpreestiro").vw.setWidth((int)(Double.parseDouble(_ancho)));
//BA.debugLineNum = 16;BA.debugLine="BtPesoPalet.left = gap+BtCalcMetros.Width"[LyEjemploAnchoBotones/General script]
views.get("btpesopalet").vw.setLeft((int)(Double.parseDouble(_gap)+(views.get("btcalcmetros").vw.getWidth())));
//BA.debugLineNum = 17;BA.debugLine="BtPesoPalet.Width= ancho"[LyEjemploAnchoBotones/General script]
views.get("btpesopalet").vw.setWidth((int)(Double.parseDouble(_ancho)));

}
}