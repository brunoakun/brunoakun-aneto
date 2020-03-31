package anetocalcV4.cerolab;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class customlistview extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "anetocalcV4.cerolab.customlistview");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", anetocalcV4.cerolab.customlistview.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _clvitem{
public boolean IsInitialized;
public anywheresoftware.b4a.objects.B4XViewWrapper Panel;
public int Size;
public Object Value;
public int Color;
public boolean TextItem;
public int Offset;
public void Initialize() {
IsInitialized = true;
Panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
Size = 0;
Value = new Object();
Color = 0;
TextItem = false;
Offset = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _sv = null;
public anywheresoftware.b4a.objects.collections.List _items = null;
public float _mdividersize = 0f;
public String _eventname = "";
public Object _callback = null;
public int _defaulttextcolor = 0;
public int _defaulttextbackgroundcolor = 0;
public int _animationduration = 0;
public long _lastreachendevent = 0L;
public int _pressedcolor = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.LabelWrapper _designerlabel = null;
public boolean _horizontal = false;
public anywheresoftware.b4a.objects.StringUtils _su = null;
public int _mfirstvisibleindex = 0;
public int _mlastvisibleindex = 0;
public boolean _monitorvisiblerange = false;
public boolean _firescrollchanged = false;
public boolean _scrollbarsvisible = false;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public anetocalcV4.cerolab.main _main = null;
public anetocalcV4.cerolab.starter _starter = null;
public anetocalcV4.cerolab.acformula01 _acformula01 = null;
public anetocalcV4.cerolab.acformula02 _acformula02 = null;
public anetocalcV4.cerolab.acformula03 _acformula03 = null;
public anetocalcV4.cerolab.formulas _formulas = null;
public String  _add(anetocalcV4.cerolab.customlistview __ref,anywheresoftware.b4a.objects.B4XViewWrapper _pnl,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "add", false))
	 {return ((String) Debug.delegate(ba, "add", new Object[] {_pnl,_value}));}
RDebugUtils.currentLine=5832704;
 //BA.debugLineNum = 5832704;BA.debugLine="Public Sub Add(Pnl As B4XView, Value As Object)";
RDebugUtils.currentLine=5832705;
 //BA.debugLineNum = 5832705;BA.debugLine="InsertAt(items.Size, Pnl, Value)";
__ref._insertat /*String*/ (null,__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .getSize(),_pnl,_value);
RDebugUtils.currentLine=5832706;
 //BA.debugLineNum = 5832706;BA.debugLine="End Sub";
return "";
}
public String  _refresh(anetocalcV4.cerolab.customlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "refresh", false))
	 {return ((String) Debug.delegate(ba, "refresh", null));}
RDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Public Sub Refresh";
RDebugUtils.currentLine=4259841;
 //BA.debugLineNum = 4259841;BA.debugLine="ResetVisibles";
__ref._resetvisibles /*String*/ (null);
RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="UpdateVisibleRange";
__ref._updatevisiblerange /*String*/ (null);
RDebugUtils.currentLine=4259843;
 //BA.debugLineNum = 4259843;BA.debugLine="End Sub";
return "";
}
public String  _insertat(anetocalcV4.cerolab.customlistview __ref,int _index,anywheresoftware.b4a.objects.B4XViewWrapper _pnl,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "insertat", false))
	 {return ((String) Debug.delegate(ba, "insertat", new Object[] {_index,_pnl,_value}));}
float _size = 0f;
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Public Sub InsertAt(Index As Int, pnl As B4XView,";
RDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="Dim size As Float";
_size = 0f;
RDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="If horizontal Then";
if (__ref._horizontal /*boolean*/ ) { 
RDebugUtils.currentLine=5111811;
 //BA.debugLineNum = 5111811;BA.debugLine="size = pnl.Width";
_size = (float) (_pnl.getWidth());
 }else {
RDebugUtils.currentLine=5111813;
 //BA.debugLineNum = 5111813;BA.debugLine="size = pnl.Height";
_size = (float) (_pnl.getHeight());
 };
RDebugUtils.currentLine=5111815;
 //BA.debugLineNum = 5111815;BA.debugLine="InsertAtImpl(Index, pnl, size, Value, 0)";
__ref._insertatimpl /*String*/ (null,_index,_pnl,(int) (_size),_value,(int) (0));
RDebugUtils.currentLine=5111816;
 //BA.debugLineNum = 5111816;BA.debugLine="End Sub";
return "";
}
public String  _addtextitem(anetocalcV4.cerolab.customlistview __ref,Object _text,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "addtextitem", false))
	 {return ((String) Debug.delegate(ba, "addtextitem", new Object[] {_text,_value}));}
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Public Sub AddTextItem(Text As Object, Value As Ob";
RDebugUtils.currentLine=4980737;
 //BA.debugLineNum = 4980737;BA.debugLine="InsertAtTextItem(items.Size, Text, Value)";
__ref._insertattextitem /*String*/ (null,__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .getSize(),_text,_value);
RDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="End Sub";
return "";
}
public String  _insertattextitem(anetocalcV4.cerolab.customlistview __ref,int _index,Object _text,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "insertattextitem", false))
	 {return ((String) Debug.delegate(ba, "insertattextitem", new Object[] {_index,_text,_value}));}
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
anywheresoftware.b4a.objects.B4XViewWrapper _lbl = null;
anetocalcV4.cerolab.customlistview._clvitem _item = null;
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Public Sub InsertAtTextItem(Index As Int, Text As";
RDebugUtils.currentLine=5046273;
 //BA.debugLineNum = 5046273;BA.debugLine="If horizontal Then";
if (__ref._horizontal /*boolean*/ ) { 
RDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="Log(\"AddTextItem is only supported in vertical o";
__c.LogImpl("25046274","AddTextItem is only supported in vertical orientation.",0);
RDebugUtils.currentLine=5046275;
 //BA.debugLineNum = 5046275;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=5046277;
 //BA.debugLineNum = 5046277;BA.debugLine="Dim pnl As B4XView = CreatePanel(\"\")";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = __ref._createpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"");
RDebugUtils.currentLine=5046278;
 //BA.debugLineNum = 5046278;BA.debugLine="Dim lbl As B4XView = CreateLabel(Text)";
_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbl = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_text);
RDebugUtils.currentLine=5046279;
 //BA.debugLineNum = 5046279;BA.debugLine="lbl.Height = Max(50dip, lbl.Height)";
_lbl.setHeight((int) (__c.Max(__c.DipToCurrent((int) (50)),_lbl.getHeight())));
RDebugUtils.currentLine=5046280;
 //BA.debugLineNum = 5046280;BA.debugLine="pnl.AddView(lbl, 5dip, 2dip, sv.ScrollViewContent";
_pnl.AddView((android.view.View)(_lbl.getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (2)),(int) (__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewContentWidth()-__c.DipToCurrent((int) (10))),_lbl.getHeight());
RDebugUtils.currentLine=5046281;
 //BA.debugLineNum = 5046281;BA.debugLine="If xui.IsB4i = False Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i()==__c.False) { 
RDebugUtils.currentLine=5046282;
 //BA.debugLineNum = 5046282;BA.debugLine="lbl.TextColor = DefaultTextColor";
_lbl.setTextColor(__ref._defaulttextcolor /*int*/ );
 };
RDebugUtils.currentLine=5046284;
 //BA.debugLineNum = 5046284;BA.debugLine="pnl.Color = DefaultTextBackgroundColor";
_pnl.setColor(__ref._defaulttextbackgroundcolor /*int*/ );
RDebugUtils.currentLine=5046285;
 //BA.debugLineNum = 5046285;BA.debugLine="pnl.Height = lbl.Height + 2dip";
_pnl.setHeight((int) (_lbl.getHeight()+__c.DipToCurrent((int) (2))));
RDebugUtils.currentLine=5046286;
 //BA.debugLineNum = 5046286;BA.debugLine="InsertAt(Index, pnl, Value)";
__ref._insertat /*String*/ (null,_index,_pnl,_value);
RDebugUtils.currentLine=5046287;
 //BA.debugLineNum = 5046287;BA.debugLine="Dim item As CLVItem = GetRawListItem(Index)";
_item = __ref._getrawlistitem /*anetocalcV4.cerolab.customlistview._clvitem*/ (null,_index);
RDebugUtils.currentLine=5046288;
 //BA.debugLineNum = 5046288;BA.debugLine="item.TextItem = True";
_item.TextItem /*boolean*/  = __c.True;
RDebugUtils.currentLine=5046289;
 //BA.debugLineNum = 5046289;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _asview(anetocalcV4.cerolab.customlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "asview", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "asview", null));}
RDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Public Sub AsView As B4XView";
RDebugUtils.currentLine=4456449;
 //BA.debugLineNum = 4456449;BA.debugLine="Return mBase";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=4456450;
 //BA.debugLineNum = 4456450;BA.debugLine="End Sub";
return null;
}
public String  _base_resize(anetocalcV4.cerolab.customlistview __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "base_resize", false))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
int _scrollbar = 0;
anetocalcV4.cerolab.customlistview._clvitem _it = null;
anywheresoftware.b4a.objects.B4XViewWrapper _lbl = null;
RDebugUtils.currentLine=4390912;
 //BA.debugLineNum = 4390912;BA.debugLine="Public Sub Base_Resize (Width As Double, Height As";
RDebugUtils.currentLine=4390913;
 //BA.debugLineNum = 4390913;BA.debugLine="sv.SetLayoutAnimated(0, 0, 0, Width, Height)";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
RDebugUtils.currentLine=4390914;
 //BA.debugLineNum = 4390914;BA.debugLine="Dim scrollbar As Int";
_scrollbar = 0;
RDebugUtils.currentLine=4390915;
 //BA.debugLineNum = 4390915;BA.debugLine="If xui.IsB4J And ScrollBarsVisible Then scrollbar";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J() && __ref._scrollbarsvisible /*boolean*/ ) { 
_scrollbar = (int) (20);};
RDebugUtils.currentLine=4390916;
 //BA.debugLineNum = 4390916;BA.debugLine="If horizontal Then";
if (__ref._horizontal /*boolean*/ ) { 
RDebugUtils.currentLine=4390917;
 //BA.debugLineNum = 4390917;BA.debugLine="sv.ScrollViewContentHeight = Height - scrollbar";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setScrollViewContentHeight((int) (_height-_scrollbar));
RDebugUtils.currentLine=4390918;
 //BA.debugLineNum = 4390918;BA.debugLine="For Each it As CLVItem In items";
{
final anywheresoftware.b4a.BA.IterableList group6 = __ref._items /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_it = (anetocalcV4.cerolab.customlistview._clvitem)(group6.Get(index6));
RDebugUtils.currentLine=4390919;
 //BA.debugLineNum = 4390919;BA.debugLine="it.Panel.Height = sv.ScrollViewContentHeight";
_it.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight(__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewContentHeight());
RDebugUtils.currentLine=4390920;
 //BA.debugLineNum = 4390920;BA.debugLine="it.Panel.GetView(0).Height = it.Panel.Height";
_it.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0)).setHeight(_it.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 }
};
 }else {
RDebugUtils.currentLine=4390923;
 //BA.debugLineNum = 4390923;BA.debugLine="sv.ScrollViewContentWidth = Width - scrollbar";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setScrollViewContentWidth((int) (_width-_scrollbar));
RDebugUtils.currentLine=4390924;
 //BA.debugLineNum = 4390924;BA.debugLine="For Each it As CLVItem In items";
{
final anywheresoftware.b4a.BA.IterableList group12 = __ref._items /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen12 = group12.getSize()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_it = (anetocalcV4.cerolab.customlistview._clvitem)(group12.Get(index12));
RDebugUtils.currentLine=4390925;
 //BA.debugLineNum = 4390925;BA.debugLine="it.Panel.Width = sv.ScrollViewContentWidth";
_it.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewContentWidth());
RDebugUtils.currentLine=4390926;
 //BA.debugLineNum = 4390926;BA.debugLine="it.Panel.GetView(0).Width = it.Panel.Width";
_it.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0)).setWidth(_it.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=4390927;
 //BA.debugLineNum = 4390927;BA.debugLine="If it.TextItem Then";
if (_it.TextItem /*boolean*/ ) { 
RDebugUtils.currentLine=4390928;
 //BA.debugLineNum = 4390928;BA.debugLine="Dim lbl As B4XView = it.Panel.GetView(0).GetVi";
_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbl = _it.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0)).GetView((int) (0));
RDebugUtils.currentLine=4390929;
 //BA.debugLineNum = 4390929;BA.debugLine="lbl.SetLayoutAnimated(0, lbl.Left, lbl.Top, it";
_lbl.SetLayoutAnimated((int) (0),_lbl.getLeft(),_lbl.getTop(),(int) (_it.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-_lbl.getLeft()),_lbl.getHeight());
 };
 }
};
 };
RDebugUtils.currentLine=4390933;
 //BA.debugLineNum = 4390933;BA.debugLine="If items.Size > 0 Then UpdateVisibleRange";
if (__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
__ref._updatevisiblerange /*String*/ (null);};
RDebugUtils.currentLine=4390934;
 //BA.debugLineNum = 4390934;BA.debugLine="End Sub";
return "";
}
public String  _updatevisiblerange(anetocalcV4.cerolab.customlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "updatevisiblerange", false))
	 {return ((String) Debug.delegate(ba, "updatevisiblerange", null));}
int _first = 0;
int _last = 0;
RDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Private Sub UpdateVisibleRange";
RDebugUtils.currentLine=5242881;
 //BA.debugLineNum = 5242881;BA.debugLine="If MonitorVisibleRange = False Or getSize = 0 The";
if (__ref._monitorvisiblerange /*boolean*/ ==__c.False || __ref._getsize /*int*/ (null)==0) { 
if (true) return "";};
RDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="Dim first As Int = getFirstVisibleIndex";
_first = __ref._getfirstvisibleindex /*int*/ (null);
RDebugUtils.currentLine=5242883;
 //BA.debugLineNum = 5242883;BA.debugLine="Dim last As Int = getLastVisibleIndex";
_last = __ref._getlastvisibleindex /*int*/ (null);
RDebugUtils.currentLine=5242884;
 //BA.debugLineNum = 5242884;BA.debugLine="If first <> mFirstVisibleIndex Or last <> mLastVi";
if (_first!=__ref._mfirstvisibleindex /*int*/  || _last!=__ref._mlastvisibleindex /*int*/ ) { 
RDebugUtils.currentLine=5242885;
 //BA.debugLineNum = 5242885;BA.debugLine="mFirstVisibleIndex = first";
__ref._mfirstvisibleindex /*int*/  = _first;
RDebugUtils.currentLine=5242886;
 //BA.debugLineNum = 5242886;BA.debugLine="mLastVisibleIndex = last";
__ref._mlastvisibleindex /*int*/  = _last;
RDebugUtils.currentLine=5242887;
 //BA.debugLineNum = 5242887;BA.debugLine="CallSubDelayed3(CallBack, EventName & \"_VisibleR";
__c.CallSubDelayed3(ba,__ref._callback /*Object*/ ,__ref._eventname /*String*/ +"_VisibleRangeChanged",(Object)(__ref._mfirstvisibleindex /*int*/ ),(Object)(__ref._mlastvisibleindex /*int*/ ));
 };
RDebugUtils.currentLine=5242889;
 //BA.debugLineNum = 5242889;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(anetocalcV4.cerolab.customlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
RDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=4063233;
 //BA.debugLineNum = 4063233;BA.debugLine="Private mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="Public sv As B4XView";
_sv = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=4063235;
 //BA.debugLineNum = 4063235;BA.debugLine="Type CLVItem(Panel As B4XView, Size As Int, Value";
;
RDebugUtils.currentLine=4063237;
 //BA.debugLineNum = 4063237;BA.debugLine="Private items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4063238;
 //BA.debugLineNum = 4063238;BA.debugLine="Private mDividerSize As Float";
_mdividersize = 0f;
RDebugUtils.currentLine=4063239;
 //BA.debugLineNum = 4063239;BA.debugLine="Private EventName As String";
_eventname = "";
RDebugUtils.currentLine=4063240;
 //BA.debugLineNum = 4063240;BA.debugLine="Private CallBack As Object";
_callback = new Object();
RDebugUtils.currentLine=4063241;
 //BA.debugLineNum = 4063241;BA.debugLine="Public DefaultTextColor As Int";
_defaulttextcolor = 0;
RDebugUtils.currentLine=4063242;
 //BA.debugLineNum = 4063242;BA.debugLine="Public DefaultTextBackgroundColor As Int";
_defaulttextbackgroundcolor = 0;
RDebugUtils.currentLine=4063243;
 //BA.debugLineNum = 4063243;BA.debugLine="Public AnimationDuration As Int = 300";
_animationduration = (int) (300);
RDebugUtils.currentLine=4063244;
 //BA.debugLineNum = 4063244;BA.debugLine="Private LastReachEndEvent As Long";
_lastreachendevent = 0L;
RDebugUtils.currentLine=4063245;
 //BA.debugLineNum = 4063245;BA.debugLine="Public PressedColor As Int";
_pressedcolor = 0;
RDebugUtils.currentLine=4063246;
 //BA.debugLineNum = 4063246;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=4063247;
 //BA.debugLineNum = 4063247;BA.debugLine="Public DesignerLabel As Label";
_designerlabel = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=4063248;
 //BA.debugLineNum = 4063248;BA.debugLine="Public horizontal As Boolean";
_horizontal = false;
RDebugUtils.currentLine=4063252;
 //BA.debugLineNum = 4063252;BA.debugLine="Private su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=4063256;
 //BA.debugLineNum = 4063256;BA.debugLine="Private mFirstVisibleIndex, mLastVisibleIndex As";
_mfirstvisibleindex = 0;
_mlastvisibleindex = 0;
RDebugUtils.currentLine=4063257;
 //BA.debugLineNum = 4063257;BA.debugLine="Private MonitorVisibleRange As Boolean";
_monitorvisiblerange = false;
RDebugUtils.currentLine=4063258;
 //BA.debugLineNum = 4063258;BA.debugLine="Private FireScrollChanged As Boolean";
_firescrollchanged = false;
RDebugUtils.currentLine=4063259;
 //BA.debugLineNum = 4063259;BA.debugLine="Private ScrollBarsVisible As Boolean";
_scrollbarsvisible = false;
RDebugUtils.currentLine=4063260;
 //BA.debugLineNum = 4063260;BA.debugLine="End Sub";
return "";
}
public String  _clear(anetocalcV4.cerolab.customlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "clear", false))
	 {return ((String) Debug.delegate(ba, "clear", null));}
RDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Public Sub Clear";
RDebugUtils.currentLine=4521985;
 //BA.debugLineNum = 4521985;BA.debugLine="items.Clear";
__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="sv.ScrollViewInnerPanel.RemoveAllViews";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewInnerPanel().RemoveAllViews();
RDebugUtils.currentLine=4521987;
 //BA.debugLineNum = 4521987;BA.debugLine="SetScrollViewContentSize(0)";
__ref._setscrollviewcontentsize /*String*/ (null,(float) (0));
RDebugUtils.currentLine=4521988;
 //BA.debugLineNum = 4521988;BA.debugLine="ResetVisibles";
__ref._resetvisibles /*String*/ (null);
RDebugUtils.currentLine=4521989;
 //BA.debugLineNum = 4521989;BA.debugLine="End Sub";
return "";
}
public String  _setscrollviewcontentsize(anetocalcV4.cerolab.customlistview __ref,float _f) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "setscrollviewcontentsize", false))
	 {return ((String) Debug.delegate(ba, "setscrollviewcontentsize", new Object[] {_f}));}
RDebugUtils.currentLine=5570560;
 //BA.debugLineNum = 5570560;BA.debugLine="Private Sub SetScrollViewContentSize(f As Float)";
RDebugUtils.currentLine=5570561;
 //BA.debugLineNum = 5570561;BA.debugLine="If horizontal Then";
if (__ref._horizontal /*boolean*/ ) { 
RDebugUtils.currentLine=5570562;
 //BA.debugLineNum = 5570562;BA.debugLine="sv.ScrollViewContentWidth = f";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setScrollViewContentWidth((int) (_f));
 }else {
RDebugUtils.currentLine=5570564;
 //BA.debugLineNum = 5570564;BA.debugLine="sv.ScrollViewContentHeight = f";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setScrollViewContentHeight((int) (_f));
 };
RDebugUtils.currentLine=5570566;
 //BA.debugLineNum = 5570566;BA.debugLine="End Sub";
return "";
}
public String  _resetvisibles(anetocalcV4.cerolab.customlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "resetvisibles", false))
	 {return ((String) Debug.delegate(ba, "resetvisibles", null));}
RDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Private Sub ResetVisibles";
RDebugUtils.currentLine=4194305;
 //BA.debugLineNum = 4194305;BA.debugLine="mFirstVisibleIndex = -1";
__ref._mfirstvisibleindex /*int*/  = (int) (-1);
RDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="mLastVisibleIndex = 0x7FFFFFFF";
__ref._mlastvisibleindex /*int*/  = (int) (0x7fffffff);
RDebugUtils.currentLine=4194307;
 //BA.debugLineNum = 4194307;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createlabel(anetocalcV4.cerolab.customlistview __ref,Object _txt) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "createlabel", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createlabel", new Object[] {_txt}));}
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=7012352;
 //BA.debugLineNum = 7012352;BA.debugLine="Private Sub CreateLabel(txt As Object) As B4XView";
RDebugUtils.currentLine=7012353;
 //BA.debugLineNum = 7012353;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=7012354;
 //BA.debugLineNum = 7012354;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(ba,"");
RDebugUtils.currentLine=7012355;
 //BA.debugLineNum = 7012355;BA.debugLine="lbl.Gravity = DesignerLabel.Gravity";
_lbl.setGravity(__ref._designerlabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .getGravity());
RDebugUtils.currentLine=7012356;
 //BA.debugLineNum = 7012356;BA.debugLine="lbl.TextSize = DesignerLabel.TextSize";
_lbl.setTextSize(__ref._designerlabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .getTextSize());
RDebugUtils.currentLine=7012357;
 //BA.debugLineNum = 7012357;BA.debugLine="lbl.Typeface = DesignerLabel.Typeface";
_lbl.setTypeface(__ref._designerlabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .getTypeface());
RDebugUtils.currentLine=7012358;
 //BA.debugLineNum = 7012358;BA.debugLine="lbl.SingleLine = False";
_lbl.setSingleLine(__c.False);
RDebugUtils.currentLine=7012359;
 //BA.debugLineNum = 7012359;BA.debugLine="lbl.Text = txt";
_lbl.setText(BA.ObjectToCharSequence(_txt));
RDebugUtils.currentLine=7012360;
 //BA.debugLineNum = 7012360;BA.debugLine="lbl.Width = sv.ScrollViewContentWidth - 10dip";
_lbl.setWidth((int) (__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewContentWidth()-__c.DipToCurrent((int) (10))));
RDebugUtils.currentLine=7012361;
 //BA.debugLineNum = 7012361;BA.debugLine="lbl.Height = su.MeasureMultilineTextHeight(lbl, t";
_lbl.setHeight(__ref._su /*anywheresoftware.b4a.objects.StringUtils*/ .MeasureMultilineTextHeight((android.widget.TextView)(_lbl.getObject()),BA.ObjectToCharSequence(_txt)));
RDebugUtils.currentLine=7012362;
 //BA.debugLineNum = 7012362;BA.debugLine="Return lbl";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=7012363;
 //BA.debugLineNum = 7012363;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createpanel(anetocalcV4.cerolab.customlistview __ref,String _paneleventname) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "createpanel", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createpanel", new Object[] {_paneleventname}));}
RDebugUtils.currentLine=6619136;
 //BA.debugLineNum = 6619136;BA.debugLine="Private Sub CreatePanel (PanelEventName As String)";
RDebugUtils.currentLine=6619137;
 //BA.debugLineNum = 6619137;BA.debugLine="Return xui.CreatePanel(PanelEventName)";
if (true) return __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,_paneleventname);
RDebugUtils.currentLine=6619138;
 //BA.debugLineNum = 6619138;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createscrollview(anetocalcV4.cerolab.customlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "createscrollview", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createscrollview", null));}
anywheresoftware.b4a.objects.HorizontalScrollViewWrapper _hv = null;
anywheresoftware.b4a.objects.ScrollViewWrapper _nsv = null;
RDebugUtils.currentLine=6881280;
 //BA.debugLineNum = 6881280;BA.debugLine="Private Sub CreateScrollView As B4XView";
RDebugUtils.currentLine=6881281;
 //BA.debugLineNum = 6881281;BA.debugLine="If horizontal Then";
if (__ref._horizontal /*boolean*/ ) { 
RDebugUtils.currentLine=6881282;
 //BA.debugLineNum = 6881282;BA.debugLine="Dim hv As HorizontalScrollView";
_hv = new anywheresoftware.b4a.objects.HorizontalScrollViewWrapper();
RDebugUtils.currentLine=6881283;
 //BA.debugLineNum = 6881283;BA.debugLine="hv.Initialize(0, \"sv\")";
_hv.Initialize(ba,(int) (0),"sv");
RDebugUtils.currentLine=6881284;
 //BA.debugLineNum = 6881284;BA.debugLine="Return hv";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_hv.getObject()));
 }else {
RDebugUtils.currentLine=6881286;
 //BA.debugLineNum = 6881286;BA.debugLine="Dim nsv As ScrollView";
_nsv = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=6881287;
 //BA.debugLineNum = 6881287;BA.debugLine="nsv.Initialize2(0, \"sv\")";
_nsv.Initialize2(ba,(int) (0),"sv");
RDebugUtils.currentLine=6881288;
 //BA.debugLineNum = 6881288;BA.debugLine="Return nsv";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_nsv.getObject()));
 };
RDebugUtils.currentLine=6881290;
 //BA.debugLineNum = 6881290;BA.debugLine="End Sub";
return null;
}
public String  _designercreateview(anetocalcV4.cerolab.customlistview __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "designercreateview", false))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
String _o = "";
anywheresoftware.b4j.object.JavaObject _jsv = null;
RDebugUtils.currentLine=4325376;
 //BA.debugLineNum = 4325376;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=4325377;
 //BA.debugLineNum = 4325377;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setObject((java.lang.Object)(_base));
RDebugUtils.currentLine=4325378;
 //BA.debugLineNum = 4325378;BA.debugLine="Dim o As String = Props.GetDefault(\"ListOrientati";
_o = BA.ObjectToString(_props.GetDefault((Object)("ListOrientation"),(Object)("Vertical")));
RDebugUtils.currentLine=4325379;
 //BA.debugLineNum = 4325379;BA.debugLine="horizontal = o = \"Horizontal\"";
__ref._horizontal /*boolean*/  = (_o).equals("Horizontal");
RDebugUtils.currentLine=4325380;
 //BA.debugLineNum = 4325380;BA.debugLine="sv = CreateScrollView";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createscrollview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null);
RDebugUtils.currentLine=4325381;
 //BA.debugLineNum = 4325381;BA.debugLine="mBase.AddView(sv, 0, 0, mBase.Width, mBase.Height";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=4325382;
 //BA.debugLineNum = 4325382;BA.debugLine="sv.ScrollViewInnerPanel.Color = xui.PaintOrColorT";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewInnerPanel().setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("DividerColor"))));
RDebugUtils.currentLine=4325383;
 //BA.debugLineNum = 4325383;BA.debugLine="mDividerSize = DipToCurrent(Props.Get(\"DividerHei";
__ref._mdividersize /*float*/  = (float) (__c.DipToCurrent((int)(BA.ObjectToNumber(_props.Get((Object)("DividerHeight"))))));
RDebugUtils.currentLine=4325384;
 //BA.debugLineNum = 4325384;BA.debugLine="PressedColor = xui.PaintOrColorToColor(Props.Get(";
__ref._pressedcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("PressedColor")));
RDebugUtils.currentLine=4325385;
 //BA.debugLineNum = 4325385;BA.debugLine="AnimationDuration = Props.GetDefault(\"InsertAnima";
__ref._animationduration /*int*/  = (int)(BA.ObjectToNumber(_props.GetDefault((Object)("InsertAnimationDuration"),(Object)(__ref._animationduration /*int*/ ))));
RDebugUtils.currentLine=4325386;
 //BA.debugLineNum = 4325386;BA.debugLine="ScrollBarsVisible = Props.GetDefault(\"ShowScrollB";
__ref._scrollbarsvisible /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("ShowScrollBar"),(Object)(__c.True)));
RDebugUtils.currentLine=4325387;
 //BA.debugLineNum = 4325387;BA.debugLine="If ScrollBarsVisible = False Then";
if (__ref._scrollbarsvisible /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=4325393;
 //BA.debugLineNum = 4325393;BA.debugLine="Dim jsv As JavaObject = sv";
_jsv = new anywheresoftware.b4j.object.JavaObject();
_jsv.setObject((java.lang.Object)(__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=4325394;
 //BA.debugLineNum = 4325394;BA.debugLine="If horizontal Then";
if (__ref._horizontal /*boolean*/ ) { 
RDebugUtils.currentLine=4325395;
 //BA.debugLineNum = 4325395;BA.debugLine="jsv.RunMethod(\"setHorizontalScrollBarEnabled\",";
_jsv.RunMethod("setHorizontalScrollBarEnabled",new Object[]{(Object)(__c.False)});
 }else {
RDebugUtils.currentLine=4325397;
 //BA.debugLineNum = 4325397;BA.debugLine="jsv.RunMethod(\"setVerticalScrollBarEnabled\", Ar";
_jsv.RunMethod("setVerticalScrollBarEnabled",new Object[]{(Object)(__c.False)});
 };
 };
RDebugUtils.currentLine=4325405;
 //BA.debugLineNum = 4325405;BA.debugLine="DefaultTextColor = xui.PaintOrColorToColor(Lbl.Te";
__ref._defaulttextcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor((Object)(_lbl.getTextColor()));
RDebugUtils.currentLine=4325406;
 //BA.debugLineNum = 4325406;BA.debugLine="DefaultTextBackgroundColor = mBase.Color";
__ref._defaulttextbackgroundcolor /*int*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getColor();
RDebugUtils.currentLine=4325407;
 //BA.debugLineNum = 4325407;BA.debugLine="DesignerLabel = Lbl";
__ref._designerlabel /*anywheresoftware.b4a.objects.LabelWrapper*/  = _lbl;
RDebugUtils.currentLine=4325408;
 //BA.debugLineNum = 4325408;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=4325409;
 //BA.debugLineNum = 4325409;BA.debugLine="End Sub";
return "";
}
public int  _findindexfromoffset(anetocalcV4.cerolab.customlistview __ref,int _offset) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "findindexfromoffset", false))
	 {return ((Integer) Debug.delegate(ba, "findindexfromoffset", new Object[] {_offset}));}
int _position = 0;
int _stepsize = 0;
anetocalcV4.cerolab.customlistview._clvitem _currentitem = null;
int _nextoffset = 0;
int _prevoffset = 0;
RDebugUtils.currentLine=6160384;
 //BA.debugLineNum = 6160384;BA.debugLine="Public Sub FindIndexFromOffset(Offset As Int) As I";
RDebugUtils.currentLine=6160385;
 //BA.debugLineNum = 6160385;BA.debugLine="If items.Size = 0 Then Return -1";
if (__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) return (int) (-1);};
RDebugUtils.currentLine=6160387;
 //BA.debugLineNum = 6160387;BA.debugLine="Dim Position As Int = items.Size / 2";
_position = (int) (__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .getSize()/(double)2);
RDebugUtils.currentLine=6160388;
 //BA.debugLineNum = 6160388;BA.debugLine="Dim StepSize As Int = Ceil(Position / 2)";
_stepsize = (int) (__c.Ceil(_position/(double)2));
RDebugUtils.currentLine=6160389;
 //BA.debugLineNum = 6160389;BA.debugLine="Do While True";
while (__c.True) {
RDebugUtils.currentLine=6160390;
 //BA.debugLineNum = 6160390;BA.debugLine="Dim CurrentItem As CLVItem = items.Get(Position)";
_currentitem = (anetocalcV4.cerolab.customlistview._clvitem)(__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .Get(_position));
RDebugUtils.currentLine=6160391;
 //BA.debugLineNum = 6160391;BA.debugLine="Dim NextOffset As Int";
_nextoffset = 0;
RDebugUtils.currentLine=6160392;
 //BA.debugLineNum = 6160392;BA.debugLine="If Position < items.Size - 1 Then";
if (_position<__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1) { 
RDebugUtils.currentLine=6160393;
 //BA.debugLineNum = 6160393;BA.debugLine="NextOffset = GetRawListItem(Position + 1).Offse";
_nextoffset = (int) (__ref._getrawlistitem /*anetocalcV4.cerolab.customlistview._clvitem*/ (null,(int) (_position+1)).Offset /*int*/ -1);
 }else {
RDebugUtils.currentLine=6160395;
 //BA.debugLineNum = 6160395;BA.debugLine="NextOffset = 0x7FFFFFFF";
_nextoffset = (int) (0x7fffffff);
 };
RDebugUtils.currentLine=6160397;
 //BA.debugLineNum = 6160397;BA.debugLine="Dim PrevOffset As Int";
_prevoffset = 0;
RDebugUtils.currentLine=6160398;
 //BA.debugLineNum = 6160398;BA.debugLine="If Position = 0 Then";
if (_position==0) { 
RDebugUtils.currentLine=6160399;
 //BA.debugLineNum = 6160399;BA.debugLine="PrevOffset = 0x80000000";
_prevoffset = (int) (0x80000000);
 }else {
RDebugUtils.currentLine=6160401;
 //BA.debugLineNum = 6160401;BA.debugLine="PrevOffset = CurrentItem.Offset";
_prevoffset = _currentitem.Offset /*int*/ ;
 };
RDebugUtils.currentLine=6160403;
 //BA.debugLineNum = 6160403;BA.debugLine="If Offset > NextOffset Then";
if (_offset>_nextoffset) { 
RDebugUtils.currentLine=6160404;
 //BA.debugLineNum = 6160404;BA.debugLine="Position = Min(Position + StepSize, items.Size";
_position = (int) (__c.Min(_position+_stepsize,__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1));
 }else 
{RDebugUtils.currentLine=6160405;
 //BA.debugLineNum = 6160405;BA.debugLine="Else if Offset < PrevOffset Then";
if (_offset<_prevoffset) { 
RDebugUtils.currentLine=6160406;
 //BA.debugLineNum = 6160406;BA.debugLine="Position = Max(Position - StepSize, 0)";
_position = (int) (__c.Max(_position-_stepsize,0));
 }else {
RDebugUtils.currentLine=6160408;
 //BA.debugLineNum = 6160408;BA.debugLine="Return Position";
if (true) return _position;
 }}
;
RDebugUtils.currentLine=6160410;
 //BA.debugLineNum = 6160410;BA.debugLine="StepSize = Ceil(StepSize / 2)";
_stepsize = (int) (__c.Ceil(_stepsize/(double)2));
 }
;
RDebugUtils.currentLine=6160412;
 //BA.debugLineNum = 6160412;BA.debugLine="Return -1";
if (true) return (int) (-1);
RDebugUtils.currentLine=6160413;
 //BA.debugLineNum = 6160413;BA.debugLine="End Sub";
return 0;
}
public anetocalcV4.cerolab.customlistview._clvitem  _getrawlistitem(anetocalcV4.cerolab.customlistview __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "getrawlistitem", false))
	 {return ((anetocalcV4.cerolab.customlistview._clvitem) Debug.delegate(ba, "getrawlistitem", new Object[] {_index}));}
RDebugUtils.currentLine=4718592;
 //BA.debugLineNum = 4718592;BA.debugLine="Public Sub GetRawListItem(Index As Int) As CLVItem";
RDebugUtils.currentLine=4718593;
 //BA.debugLineNum = 4718593;BA.debugLine="Return items.Get(Index)";
if (true) return (anetocalcV4.cerolab.customlistview._clvitem)(__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .Get(_index));
RDebugUtils.currentLine=4718594;
 //BA.debugLineNum = 4718594;BA.debugLine="End Sub";
return null;
}
public int  _finditemoffset(anetocalcV4.cerolab.customlistview __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "finditemoffset", false))
	 {return ((Integer) Debug.delegate(ba, "finditemoffset", new Object[] {_index}));}
RDebugUtils.currentLine=6094848;
 //BA.debugLineNum = 6094848;BA.debugLine="Private Sub FindItemOffset(Index As Int) As Int";
RDebugUtils.currentLine=6094849;
 //BA.debugLineNum = 6094849;BA.debugLine="Return GetRawListItem(Index).Offset";
if (true) return __ref._getrawlistitem /*anetocalcV4.cerolab.customlistview._clvitem*/ (null,_index).Offset /*int*/ ;
RDebugUtils.currentLine=6094850;
 //BA.debugLineNum = 6094850;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getbase(anetocalcV4.cerolab.customlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "getbase", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getbase", null));}
RDebugUtils.currentLine=4587520;
 //BA.debugLineNum = 4587520;BA.debugLine="Public Sub GetBase As B4XView";
RDebugUtils.currentLine=4587521;
 //BA.debugLineNum = 4587521;BA.debugLine="Return mBase";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=4587522;
 //BA.debugLineNum = 4587522;BA.debugLine="End Sub";
return null;
}
public float  _getdividersize(anetocalcV4.cerolab.customlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "getdividersize", false))
	 {return ((Float) Debug.delegate(ba, "getdividersize", null));}
RDebugUtils.currentLine=6684672;
 //BA.debugLineNum = 6684672;BA.debugLine="Public Sub getDividerSize As Float";
RDebugUtils.currentLine=6684673;
 //BA.debugLineNum = 6684673;BA.debugLine="Return mDividerSize";
if (true) return __ref._mdividersize /*float*/ ;
RDebugUtils.currentLine=6684674;
 //BA.debugLineNum = 6684674;BA.debugLine="End Sub";
return 0f;
}
public int  _getfirstvisibleindex(anetocalcV4.cerolab.customlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "getfirstvisibleindex", false))
	 {return ((Integer) Debug.delegate(ba, "getfirstvisibleindex", null));}
RDebugUtils.currentLine=6225920;
 //BA.debugLineNum = 6225920;BA.debugLine="Public Sub getFirstVisibleIndex As Int";
RDebugUtils.currentLine=6225921;
 //BA.debugLineNum = 6225921;BA.debugLine="Return FindIndexFromOffset(GetScrollViewOffset +";
if (true) return __ref._findindexfromoffset /*int*/ (null,(int) (__ref._getscrollviewoffset /*float*/ (null)+__ref._mdividersize /*float*/ ));
RDebugUtils.currentLine=6225922;
 //BA.debugLineNum = 6225922;BA.debugLine="End Sub";
return 0;
}
public float  _getscrollviewoffset(anetocalcV4.cerolab.customlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "getscrollviewoffset", false))
	 {return ((Float) Debug.delegate(ba, "getscrollviewoffset", null));}
RDebugUtils.currentLine=5373952;
 //BA.debugLineNum = 5373952;BA.debugLine="Private Sub GetScrollViewOffset As Float";
RDebugUtils.currentLine=5373953;
 //BA.debugLineNum = 5373953;BA.debugLine="If horizontal Then";
if (__ref._horizontal /*boolean*/ ) { 
RDebugUtils.currentLine=5373954;
 //BA.debugLineNum = 5373954;BA.debugLine="Return sv.ScrollViewOffsetX";
if (true) return (float) (__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewOffsetX());
 }else {
RDebugUtils.currentLine=5373956;
 //BA.debugLineNum = 5373956;BA.debugLine="Return sv.ScrollViewOffsetY";
if (true) return (float) (__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewOffsetY());
 };
RDebugUtils.currentLine=5373958;
 //BA.debugLineNum = 5373958;BA.debugLine="End Sub";
return 0f;
}
public int  _getitemfromview(anetocalcV4.cerolab.customlistview __ref,anywheresoftware.b4a.objects.B4XViewWrapper _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "getitemfromview", false))
	 {return ((Integer) Debug.delegate(ba, "getitemfromview", new Object[] {_v}));}
Object _parent = null;
anywheresoftware.b4a.objects.B4XViewWrapper _current = null;
RDebugUtils.currentLine=6488064;
 //BA.debugLineNum = 6488064;BA.debugLine="Public Sub GetItemFromView(v As B4XView) As Int";
RDebugUtils.currentLine=6488065;
 //BA.debugLineNum = 6488065;BA.debugLine="Dim parent = v As Object, current As B4XView";
_parent = (Object)(_v.getObject());
_current = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=6488066;
 //BA.debugLineNum = 6488066;BA.debugLine="Do While sv.ScrollViewInnerPanel <> parent";
while ((__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewInnerPanel()).equals((java.lang.Object)(_parent)) == false) {
RDebugUtils.currentLine=6488067;
 //BA.debugLineNum = 6488067;BA.debugLine="current = parent";
_current.setObject((java.lang.Object)(_parent));
RDebugUtils.currentLine=6488068;
 //BA.debugLineNum = 6488068;BA.debugLine="parent = current.Parent";
_parent = (Object)(_current.getParent().getObject());
 }
;
RDebugUtils.currentLine=6488070;
 //BA.debugLineNum = 6488070;BA.debugLine="v = current";
_v = _current;
RDebugUtils.currentLine=6488071;
 //BA.debugLineNum = 6488071;BA.debugLine="Return v.Tag";
if (true) return (int)(BA.ObjectToNumber(_v.getTag()));
RDebugUtils.currentLine=6488072;
 //BA.debugLineNum = 6488072;BA.debugLine="End Sub";
return 0;
}
public int  _getlastvisibleindex(anetocalcV4.cerolab.customlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "getlastvisibleindex", false))
	 {return ((Integer) Debug.delegate(ba, "getlastvisibleindex", null));}
RDebugUtils.currentLine=6291456;
 //BA.debugLineNum = 6291456;BA.debugLine="Public Sub getLastVisibleIndex As Int";
RDebugUtils.currentLine=6291457;
 //BA.debugLineNum = 6291457;BA.debugLine="Return FindIndexFromOffset(GetScrollViewOffset +";
if (true) return __ref._findindexfromoffset /*int*/ (null,(int) (__ref._getscrollviewoffset /*float*/ (null)+__ref._getscrollviewvisiblesize /*float*/ (null)));
RDebugUtils.currentLine=6291458;
 //BA.debugLineNum = 6291458;BA.debugLine="End Sub";
return 0;
}
public float  _getscrollviewvisiblesize(anetocalcV4.cerolab.customlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "getscrollviewvisiblesize", false))
	 {return ((Float) Debug.delegate(ba, "getscrollviewvisiblesize", null));}
RDebugUtils.currentLine=5308416;
 //BA.debugLineNum = 5308416;BA.debugLine="Private Sub GetScrollViewVisibleSize As Float";
RDebugUtils.currentLine=5308417;
 //BA.debugLineNum = 5308417;BA.debugLine="If horizontal Then";
if (__ref._horizontal /*boolean*/ ) { 
RDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="Return sv.Width";
if (true) return (float) (__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
 }else {
RDebugUtils.currentLine=5308420;
 //BA.debugLineNum = 5308420;BA.debugLine="Return sv.Height";
if (true) return (float) (__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 };
RDebugUtils.currentLine=5308422;
 //BA.debugLineNum = 5308422;BA.debugLine="End Sub";
return 0f;
}
public float  _getmaxscrolloffset(anetocalcV4.cerolab.customlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "getmaxscrolloffset", false))
	 {return ((Float) Debug.delegate(ba, "getmaxscrolloffset", null));}
RDebugUtils.currentLine=5963776;
 //BA.debugLineNum = 5963776;BA.debugLine="Private Sub GetMaxScrollOffset As Float";
RDebugUtils.currentLine=5963777;
 //BA.debugLineNum = 5963777;BA.debugLine="Return GetScrollViewContentSize - GetScrollViewVi";
if (true) return (float) (__ref._getscrollviewcontentsize /*float*/ (null)-__ref._getscrollviewvisiblesize /*float*/ (null));
RDebugUtils.currentLine=5963778;
 //BA.debugLineNum = 5963778;BA.debugLine="End Sub";
return 0f;
}
public float  _getscrollviewcontentsize(anetocalcV4.cerolab.customlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "getscrollviewcontentsize", false))
	 {return ((Float) Debug.delegate(ba, "getscrollviewcontentsize", null));}
RDebugUtils.currentLine=5505024;
 //BA.debugLineNum = 5505024;BA.debugLine="Private Sub GetScrollViewContentSize As Float";
RDebugUtils.currentLine=5505025;
 //BA.debugLineNum = 5505025;BA.debugLine="If horizontal Then";
if (__ref._horizontal /*boolean*/ ) { 
RDebugUtils.currentLine=5505026;
 //BA.debugLineNum = 5505026;BA.debugLine="Return sv.ScrollViewContentWidth";
if (true) return (float) (__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewContentWidth());
 }else {
RDebugUtils.currentLine=5505028;
 //BA.debugLineNum = 5505028;BA.debugLine="Return sv.ScrollViewContentHeight";
if (true) return (float) (__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewContentHeight());
 };
RDebugUtils.currentLine=5505030;
 //BA.debugLineNum = 5505030;BA.debugLine="End Sub";
return 0f;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(anetocalcV4.cerolab.customlistview __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "getpanel", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getpanel", new Object[] {_index}));}
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Public Sub GetPanel(Index As Int) As B4XView";
RDebugUtils.currentLine=4784129;
 //BA.debugLineNum = 4784129;BA.debugLine="Return GetRawListItem(Index).Panel.GetView(0)";
if (true) return __ref._getrawlistitem /*anetocalcV4.cerolab.customlistview._clvitem*/ (null,_index).Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0));
RDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="End Sub";
return null;
}
public int  _getsize(anetocalcV4.cerolab.customlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "getsize", false))
	 {return ((Integer) Debug.delegate(ba, "getsize", null));}
RDebugUtils.currentLine=4653056;
 //BA.debugLineNum = 4653056;BA.debugLine="Public Sub getSize As Int";
RDebugUtils.currentLine=4653057;
 //BA.debugLineNum = 4653057;BA.debugLine="Return items.Size";
if (true) return __ref._items /*anywheresoftware.b4a.objects.collections.List*/ .getSize();
RDebugUtils.currentLine=4653058;
 //BA.debugLineNum = 4653058;BA.debugLine="End Sub";
return 0;
}
public Object  _getvalue(anetocalcV4.cerolab.customlistview __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "getvalue", false))
	 {return ((Object) Debug.delegate(ba, "getvalue", new Object[] {_index}));}
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Public Sub GetValue(Index As Int) As Object";
RDebugUtils.currentLine=4849665;
 //BA.debugLineNum = 4849665;BA.debugLine="Return GetRawListItem(Index).Value";
if (true) return __ref._getrawlistitem /*anetocalcV4.cerolab.customlistview._clvitem*/ (null,_index).Value /*Object*/ ;
RDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anetocalcV4.cerolab.customlistview __ref,anywheresoftware.b4a.BA _ba,Object _vcallback,String _veventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_vcallback,_veventname}));}
RDebugUtils.currentLine=4128768;
 //BA.debugLineNum = 4128768;BA.debugLine="Public Sub Initialize (vCallBack As Object, vEvent";
RDebugUtils.currentLine=4128769;
 //BA.debugLineNum = 4128769;BA.debugLine="EventName = vEventName";
__ref._eventname /*String*/  = _veventname;
RDebugUtils.currentLine=4128770;
 //BA.debugLineNum = 4128770;BA.debugLine="CallBack = vCallBack";
__ref._callback /*Object*/  = _vcallback;
RDebugUtils.currentLine=4128771;
 //BA.debugLineNum = 4128771;BA.debugLine="items.Initialize";
__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=4128772;
 //BA.debugLineNum = 4128772;BA.debugLine="DefaultTextBackgroundColor = xui.Color_White";
__ref._defaulttextbackgroundcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=4128773;
 //BA.debugLineNum = 4128773;BA.debugLine="DefaultTextColor = xui.Color_Black";
__ref._defaulttextcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
RDebugUtils.currentLine=4128774;
 //BA.debugLineNum = 4128774;BA.debugLine="MonitorVisibleRange = xui.SubExists(CallBack, Eve";
__ref._monitorvisiblerange /*boolean*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._callback /*Object*/ ,__ref._eventname /*String*/ +"_VisibleRangeChanged",(int) (2));
RDebugUtils.currentLine=4128775;
 //BA.debugLineNum = 4128775;BA.debugLine="FireScrollChanged = xui.SubExists(CallBack, Event";
__ref._firescrollchanged /*boolean*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._callback /*Object*/ ,__ref._eventname /*String*/ +"_ScrollChanged",(int) (1));
RDebugUtils.currentLine=4128782;
 //BA.debugLineNum = 4128782;BA.debugLine="ResetVisibles";
__ref._resetvisibles /*String*/ (null);
RDebugUtils.currentLine=4128783;
 //BA.debugLineNum = 4128783;BA.debugLine="End Sub";
return "";
}
public String  _insertatimpl(anetocalcV4.cerolab.customlistview __ref,int _index,anywheresoftware.b4a.objects.B4XViewWrapper _pnl,int _itemsize,Object _value,int _initialsize) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "insertatimpl", false))
	 {return ((String) Debug.delegate(ba, "insertatimpl", new Object[] {_index,_pnl,_itemsize,_value,_initialsize}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
int _includedividierheight = 0;
anetocalcV4.cerolab.customlistview._clvitem _newitem = null;
int _offset = 0;
anetocalcV4.cerolab.customlistview._clvitem _previtem = null;
int _i = 0;
anetocalcV4.cerolab.customlistview._clvitem _it = null;
int _newoffset = 0;
RDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Private Sub InsertAtImpl(Index As Int, Pnl As B4XV";
RDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="Dim p As B4XView = CreatePanel(\"Panel\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._createpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"Panel");
RDebugUtils.currentLine=5177347;
 //BA.debugLineNum = 5177347;BA.debugLine="p.Color = Pnl.Color";
_p.setColor(_pnl.getColor());
RDebugUtils.currentLine=5177348;
 //BA.debugLineNum = 5177348;BA.debugLine="Pnl.Color = xui.Color_Transparent";
_pnl.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=5177349;
 //BA.debugLineNum = 5177349;BA.debugLine="If horizontal Then";
if (__ref._horizontal /*boolean*/ ) { 
RDebugUtils.currentLine=5177350;
 //BA.debugLineNum = 5177350;BA.debugLine="p.AddView(Pnl, 0, 0, ItemSize, sv.ScrollViewCont";
_p.AddView((android.view.View)(_pnl.getObject()),(int) (0),(int) (0),_itemsize,__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewContentHeight());
 }else {
RDebugUtils.currentLine=5177352;
 //BA.debugLineNum = 5177352;BA.debugLine="p.AddView(Pnl, 0, 0, sv.ScrollViewContentWidth,";
_p.AddView((android.view.View)(_pnl.getObject()),(int) (0),(int) (0),__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewContentWidth(),_itemsize);
 };
RDebugUtils.currentLine=5177354;
 //BA.debugLineNum = 5177354;BA.debugLine="p.Tag = Index";
_p.setTag((Object)(_index));
RDebugUtils.currentLine=5177355;
 //BA.debugLineNum = 5177355;BA.debugLine="Dim IncludeDividierHeight As Int";
_includedividierheight = 0;
RDebugUtils.currentLine=5177356;
 //BA.debugLineNum = 5177356;BA.debugLine="If InitialSize = 0 Then IncludeDividierHeight = m";
if (_initialsize==0) { 
_includedividierheight = (int) (__ref._mdividersize /*float*/ );}
else {
_includedividierheight = (int) (0);};
RDebugUtils.currentLine=5177357;
 //BA.debugLineNum = 5177357;BA.debugLine="Dim NewItem As CLVItem";
_newitem = new anetocalcV4.cerolab.customlistview._clvitem();
RDebugUtils.currentLine=5177358;
 //BA.debugLineNum = 5177358;BA.debugLine="NewItem.Panel = p";
_newitem.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _p;
RDebugUtils.currentLine=5177359;
 //BA.debugLineNum = 5177359;BA.debugLine="NewItem.Size = ItemSize";
_newitem.Size /*int*/  = _itemsize;
RDebugUtils.currentLine=5177360;
 //BA.debugLineNum = 5177360;BA.debugLine="NewItem.Value = Value";
_newitem.Value /*Object*/  = _value;
RDebugUtils.currentLine=5177361;
 //BA.debugLineNum = 5177361;BA.debugLine="NewItem.Color = p.Color";
_newitem.Color /*int*/  = _p.getColor();
RDebugUtils.currentLine=5177362;
 //BA.debugLineNum = 5177362;BA.debugLine="If Index = items.Size And InitialSize = 0 Then";
if (_index==__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .getSize() && _initialsize==0) { 
RDebugUtils.currentLine=5177363;
 //BA.debugLineNum = 5177363;BA.debugLine="items.Add(NewItem)";
__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_newitem));
RDebugUtils.currentLine=5177364;
 //BA.debugLineNum = 5177364;BA.debugLine="Dim offset As Int";
_offset = 0;
RDebugUtils.currentLine=5177365;
 //BA.debugLineNum = 5177365;BA.debugLine="If Index = 0 Then";
if (_index==0) { 
RDebugUtils.currentLine=5177366;
 //BA.debugLineNum = 5177366;BA.debugLine="offset = mDividerSize";
_offset = (int) (__ref._mdividersize /*float*/ );
 }else {
RDebugUtils.currentLine=5177368;
 //BA.debugLineNum = 5177368;BA.debugLine="offset = GetScrollViewContentSize";
_offset = (int) (__ref._getscrollviewcontentsize /*float*/ (null));
 };
RDebugUtils.currentLine=5177370;
 //BA.debugLineNum = 5177370;BA.debugLine="NewItem.Offset = offset";
_newitem.Offset /*int*/  = _offset;
RDebugUtils.currentLine=5177371;
 //BA.debugLineNum = 5177371;BA.debugLine="If horizontal Then";
if (__ref._horizontal /*boolean*/ ) { 
RDebugUtils.currentLine=5177372;
 //BA.debugLineNum = 5177372;BA.debugLine="sv.ScrollViewInnerPanel.AddView(p, offset, 0, I";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewInnerPanel().AddView((android.view.View)(_p.getObject()),_offset,(int) (0),_itemsize,__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 }else {
RDebugUtils.currentLine=5177374;
 //BA.debugLineNum = 5177374;BA.debugLine="sv.ScrollViewInnerPanel.AddView(p, 0, offset, s";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewInnerPanel().AddView((android.view.View)(_p.getObject()),(int) (0),_offset,__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),_itemsize);
 };
 }else {
RDebugUtils.currentLine=5177377;
 //BA.debugLineNum = 5177377;BA.debugLine="Dim offset As Int";
_offset = 0;
RDebugUtils.currentLine=5177378;
 //BA.debugLineNum = 5177378;BA.debugLine="If Index = 0 Then";
if (_index==0) { 
RDebugUtils.currentLine=5177379;
 //BA.debugLineNum = 5177379;BA.debugLine="offset = mDividerSize";
_offset = (int) (__ref._mdividersize /*float*/ );
 }else {
RDebugUtils.currentLine=5177381;
 //BA.debugLineNum = 5177381;BA.debugLine="Dim PrevItem As CLVItem = items.Get(Index - 1)";
_previtem = (anetocalcV4.cerolab.customlistview._clvitem)(__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (_index-1)));
RDebugUtils.currentLine=5177382;
 //BA.debugLineNum = 5177382;BA.debugLine="offset = PrevItem.Offset + PrevItem.Size + mDiv";
_offset = (int) (_previtem.Offset /*int*/ +_previtem.Size /*int*/ +__ref._mdividersize /*float*/ );
 };
RDebugUtils.currentLine=5177384;
 //BA.debugLineNum = 5177384;BA.debugLine="For i = Index To items.Size - 1";
{
final int step39 = 1;
final int limit39 = (int) (__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = _index ;
for (;_i <= limit39 ;_i = _i + step39 ) {
RDebugUtils.currentLine=5177385;
 //BA.debugLineNum = 5177385;BA.debugLine="Dim It As CLVItem = items.Get(i)";
_it = (anetocalcV4.cerolab.customlistview._clvitem)(__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=5177386;
 //BA.debugLineNum = 5177386;BA.debugLine="Dim NewOffset As Int = It.Offset + ItemSize - I";
_newoffset = (int) (_it.Offset /*int*/ +_itemsize-_initialsize+_includedividierheight);
RDebugUtils.currentLine=5177387;
 //BA.debugLineNum = 5177387;BA.debugLine="If Min(NewOffset, It.Offset) - GetScrollViewOff";
if (__c.Min(_newoffset,_it.Offset /*int*/ )-__ref._getscrollviewoffset /*float*/ (null)<__ref._getscrollviewvisiblesize /*float*/ (null)) { 
RDebugUtils.currentLine=5177388;
 //BA.debugLineNum = 5177388;BA.debugLine="It.Offset = NewOffset";
_it.Offset /*int*/  = _newoffset;
RDebugUtils.currentLine=5177389;
 //BA.debugLineNum = 5177389;BA.debugLine="If horizontal Then";
if (__ref._horizontal /*boolean*/ ) { 
RDebugUtils.currentLine=5177390;
 //BA.debugLineNum = 5177390;BA.debugLine="It.Panel.SetLayoutAnimated(AnimationDuration,";
_it.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated(__ref._animationduration /*int*/ ,_newoffset,(int) (0),_it.Size /*int*/ ,_it.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 }else {
RDebugUtils.currentLine=5177392;
 //BA.debugLineNum = 5177392;BA.debugLine="It.Panel.SetLayoutAnimated(AnimationDuration,";
_it.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated(__ref._animationduration /*int*/ ,(int) (0),_newoffset,_it.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),_it.Size /*int*/ );
 };
 }else {
RDebugUtils.currentLine=5177395;
 //BA.debugLineNum = 5177395;BA.debugLine="SetItemOffset(It, NewOffset)";
__ref._setitemoffset /*String*/ (null,_it,(float) (_newoffset));
 };
RDebugUtils.currentLine=5177397;
 //BA.debugLineNum = 5177397;BA.debugLine="It.Panel.Tag = i + 1";
_it.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag((Object)(_i+1));
 }
};
RDebugUtils.currentLine=5177399;
 //BA.debugLineNum = 5177399;BA.debugLine="items.InsertAt(Index, NewItem)";
__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .InsertAt(_index,(Object)(_newitem));
RDebugUtils.currentLine=5177400;
 //BA.debugLineNum = 5177400;BA.debugLine="NewItem.Offset = offset";
_newitem.Offset /*int*/  = _offset;
RDebugUtils.currentLine=5177401;
 //BA.debugLineNum = 5177401;BA.debugLine="If horizontal Then";
if (__ref._horizontal /*boolean*/ ) { 
RDebugUtils.currentLine=5177402;
 //BA.debugLineNum = 5177402;BA.debugLine="sv.ScrollViewInnerPanel.AddView(p, offset, 0, I";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewInnerPanel().AddView((android.view.View)(_p.getObject()),_offset,(int) (0),_initialsize,__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=5177403;
 //BA.debugLineNum = 5177403;BA.debugLine="p.SetLayoutAnimated(AnimationDuration, offset,";
_p.SetLayoutAnimated(__ref._animationduration /*int*/ ,_offset,(int) (0),_itemsize,_p.getHeight());
 }else {
RDebugUtils.currentLine=5177405;
 //BA.debugLineNum = 5177405;BA.debugLine="sv.ScrollViewInnerPanel.AddView(p, 0, offset, s";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewInnerPanel().AddView((android.view.View)(_p.getObject()),(int) (0),_offset,__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),_initialsize);
RDebugUtils.currentLine=5177406;
 //BA.debugLineNum = 5177406;BA.debugLine="p.SetLayoutAnimated(AnimationDuration, 0, offse";
_p.SetLayoutAnimated(__ref._animationduration /*int*/ ,(int) (0),_offset,_p.getWidth(),_itemsize);
 };
 };
RDebugUtils.currentLine=5177409;
 //BA.debugLineNum = 5177409;BA.debugLine="SetScrollViewContentSize(GetScrollViewContentSize";
__ref._setscrollviewcontentsize /*String*/ (null,(float) (__ref._getscrollviewcontentsize /*float*/ (null)+_itemsize-_initialsize+_includedividierheight));
RDebugUtils.currentLine=5177410;
 //BA.debugLineNum = 5177410;BA.debugLine="If items.Size = 1 And Index = 0 Then SetScrollVie";
if (__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==1 && _index==0) { 
__ref._setscrollviewcontentsize /*String*/ (null,(float) (_itemsize+__ref._mdividersize /*float*/ *2));};
RDebugUtils.currentLine=5177411;
 //BA.debugLineNum = 5177411;BA.debugLine="If Index < mLastVisibleIndex Or GetRawListItem(mL";
if (_index<__ref._mlastvisibleindex /*int*/  || __ref._getrawlistitem /*anetocalcV4.cerolab.customlistview._clvitem*/ (null,__ref._mlastvisibleindex /*int*/ ).Offset /*int*/ +__ref._getrawlistitem /*anetocalcV4.cerolab.customlistview._clvitem*/ (null,__ref._mlastvisibleindex /*int*/ ).Size /*int*/ +__ref._mdividersize /*float*/ <__ref._getscrollviewvisiblesize /*float*/ (null)) { 
RDebugUtils.currentLine=5177413;
 //BA.debugLineNum = 5177413;BA.debugLine="UpdateVisibleRange";
__ref._updatevisiblerange /*String*/ (null);
 };
RDebugUtils.currentLine=5177415;
 //BA.debugLineNum = 5177415;BA.debugLine="End Sub";
return "";
}
public String  _setitemoffset(anetocalcV4.cerolab.customlistview __ref,anetocalcV4.cerolab.customlistview._clvitem _item,float _offset) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "setitemoffset", false))
	 {return ((String) Debug.delegate(ba, "setitemoffset", new Object[] {_item,_offset}));}
RDebugUtils.currentLine=5636096;
 //BA.debugLineNum = 5636096;BA.debugLine="Private Sub SetItemOffset (item As CLVItem, offset";
RDebugUtils.currentLine=5636097;
 //BA.debugLineNum = 5636097;BA.debugLine="item.Offset = offset";
_item.Offset /*int*/  = (int) (_offset);
RDebugUtils.currentLine=5636098;
 //BA.debugLineNum = 5636098;BA.debugLine="If horizontal Then";
if (__ref._horizontal /*boolean*/ ) { 
RDebugUtils.currentLine=5636099;
 //BA.debugLineNum = 5636099;BA.debugLine="item.Panel.Left = offset";
_item.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setLeft((int) (_offset));
 }else {
RDebugUtils.currentLine=5636101;
 //BA.debugLineNum = 5636101;BA.debugLine="item.Panel.Top = offset";
_item.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTop((int) (_offset));
 };
RDebugUtils.currentLine=5636103;
 //BA.debugLineNum = 5636103;BA.debugLine="End Sub";
return "";
}
public String  _jumptoitem(anetocalcV4.cerolab.customlistview __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "jumptoitem", false))
	 {return ((String) Debug.delegate(ba, "jumptoitem", new Object[] {_index}));}
RDebugUtils.currentLine=5898240;
 //BA.debugLineNum = 5898240;BA.debugLine="Public Sub JumpToItem(Index As Int)";
RDebugUtils.currentLine=5898241;
 //BA.debugLineNum = 5898241;BA.debugLine="SetScrollViewOffset(Min(GetMaxScrollOffset, FindI";
__ref._setscrollviewoffset /*String*/ (null,(float) (__c.Min(__ref._getmaxscrolloffset /*float*/ (null),__ref._finditemoffset /*int*/ (null,_index))));
RDebugUtils.currentLine=5898242;
 //BA.debugLineNum = 5898242;BA.debugLine="End Sub";
return "";
}
public String  _setscrollviewoffset(anetocalcV4.cerolab.customlistview __ref,float _offset) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "setscrollviewoffset", false))
	 {return ((String) Debug.delegate(ba, "setscrollviewoffset", new Object[] {_offset}));}
RDebugUtils.currentLine=5439488;
 //BA.debugLineNum = 5439488;BA.debugLine="Private Sub SetScrollViewOffset(offset As Float)";
RDebugUtils.currentLine=5439489;
 //BA.debugLineNum = 5439489;BA.debugLine="If horizontal Then";
if (__ref._horizontal /*boolean*/ ) { 
RDebugUtils.currentLine=5439490;
 //BA.debugLineNum = 5439490;BA.debugLine="sv.ScrollViewOffsetX = offset";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setScrollViewOffsetX((int) (_offset));
 }else {
RDebugUtils.currentLine=5439492;
 //BA.debugLineNum = 5439492;BA.debugLine="sv.ScrollViewOffsetY = offset";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setScrollViewOffsetY((int) (_offset));
 };
RDebugUtils.currentLine=5439494;
 //BA.debugLineNum = 5439494;BA.debugLine="End Sub";
return "";
}
public String  _panel_click(anetocalcV4.cerolab.customlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "panel_click", false))
	 {return ((String) Debug.delegate(ba, "panel_click", null));}
RDebugUtils.currentLine=6750208;
 //BA.debugLineNum = 6750208;BA.debugLine="Private Sub Panel_Click";
RDebugUtils.currentLine=6750209;
 //BA.debugLineNum = 6750209;BA.debugLine="PanelClickHandler(Sender)";
__ref._panelclickhandler /*void*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))));
RDebugUtils.currentLine=6750210;
 //BA.debugLineNum = 6750210;BA.debugLine="End Sub";
return "";
}
public void  _panelclickhandler(anetocalcV4.cerolab.customlistview __ref,anywheresoftware.b4a.objects.B4XViewWrapper _senderpanel) throws Exception{
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "panelclickhandler", false))
	 {Debug.delegate(ba, "panelclickhandler", new Object[] {_senderpanel}); return;}
ResumableSub_PanelClickHandler rsub = new ResumableSub_PanelClickHandler(this,__ref,_senderpanel);
rsub.resume(ba, null);
}
public static class ResumableSub_PanelClickHandler extends BA.ResumableSub {
public ResumableSub_PanelClickHandler(anetocalcV4.cerolab.customlistview parent,anetocalcV4.cerolab.customlistview __ref,anywheresoftware.b4a.objects.B4XViewWrapper _senderpanel) {
this.parent = parent;
this.__ref = __ref;
this._senderpanel = _senderpanel;
this.__ref = parent;
}
anetocalcV4.cerolab.customlistview __ref;
anetocalcV4.cerolab.customlistview parent;
anywheresoftware.b4a.objects.B4XViewWrapper _senderpanel;
int _clr = 0;
boolean _istransparentpressedcolor = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="customlistview";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=6422530;
 //BA.debugLineNum = 6422530;BA.debugLine="Dim clr As Int = GetRawListItem(SenderPanel.Tag).";
_clr = __ref._getrawlistitem /*anetocalcV4.cerolab.customlistview._clvitem*/ (null,(int)(BA.ObjectToNumber(_senderpanel.getTag()))).Color /*int*/ ;
RDebugUtils.currentLine=6422531;
 //BA.debugLineNum = 6422531;BA.debugLine="Dim IsTransparentPressedColor As Boolean = Bit.An";
_istransparentpressedcolor = parent.__c.Bit.And((int) (0xff000000),__ref._pressedcolor /*int*/ )==0;
RDebugUtils.currentLine=6422532;
 //BA.debugLineNum = 6422532;BA.debugLine="If IsTransparentPressedColor = False Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_istransparentpressedcolor==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=6422533;
 //BA.debugLineNum = 6422533;BA.debugLine="SenderPanel.SetColorAnimated(50, clr, PressedCol";
_senderpanel.SetColorAnimated((int) (50),_clr,__ref._pressedcolor /*int*/ );
 if (true) break;
;
RDebugUtils.currentLine=6422535;
 //BA.debugLineNum = 6422535;BA.debugLine="If xui.SubExists(CallBack, EventName & \"_ItemClic";

case 4:
//if
this.state = 7;
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._callback /*Object*/ ,__ref._eventname /*String*/ +"_ItemClick",(int) (2))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=6422536;
 //BA.debugLineNum = 6422536;BA.debugLine="CallSub3(CallBack, EventName & \"_ItemClick\", Sen";
parent.__c.CallSubNew3(ba,__ref._callback /*Object*/ ,__ref._eventname /*String*/ +"_ItemClick",_senderpanel.getTag(),__ref._getrawlistitem /*anetocalcV4.cerolab.customlistview._clvitem*/ (null,(int)(BA.ObjectToNumber(_senderpanel.getTag()))).Value /*Object*/ );
 if (true) break;
;
RDebugUtils.currentLine=6422538;
 //BA.debugLineNum = 6422538;BA.debugLine="If IsTransparentPressedColor = False Then";

case 7:
//if
this.state = 10;
if (_istransparentpressedcolor==parent.__c.False) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=6422539;
 //BA.debugLineNum = 6422539;BA.debugLine="Sleep(200)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "customlistview", "panelclickhandler"),(int) (200));
this.state = 11;
return;
case 11:
//C
this.state = 10;
;
RDebugUtils.currentLine=6422540;
 //BA.debugLineNum = 6422540;BA.debugLine="SenderPanel.SetColorAnimated(200, PressedColor,";
_senderpanel.SetColorAnimated((int) (200),__ref._pressedcolor /*int*/ ,_clr);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=6422542;
 //BA.debugLineNum = 6422542;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _panel_longclick(anetocalcV4.cerolab.customlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "panel_longclick", false))
	 {return ((String) Debug.delegate(ba, "panel_longclick", null));}
RDebugUtils.currentLine=6815744;
 //BA.debugLineNum = 6815744;BA.debugLine="Private Sub Panel_LongClick";
RDebugUtils.currentLine=6815745;
 //BA.debugLineNum = 6815745;BA.debugLine="PanelLongClickHandler(Sender)";
__ref._panellongclickhandler /*String*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))));
RDebugUtils.currentLine=6815746;
 //BA.debugLineNum = 6815746;BA.debugLine="End Sub";
return "";
}
public String  _panellongclickhandler(anetocalcV4.cerolab.customlistview __ref,anywheresoftware.b4a.objects.B4XViewWrapper _senderpanel) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "panellongclickhandler", false))
	 {return ((String) Debug.delegate(ba, "panellongclickhandler", new Object[] {_senderpanel}));}
RDebugUtils.currentLine=6356992;
 //BA.debugLineNum = 6356992;BA.debugLine="Private Sub PanelLongClickHandler(SenderPanel As B";
RDebugUtils.currentLine=6356993;
 //BA.debugLineNum = 6356993;BA.debugLine="If xui.SubExists(CallBack, EventName & \"_ItemLong";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._callback /*Object*/ ,__ref._eventname /*String*/ +"_ItemLongClick",(int) (2))) { 
RDebugUtils.currentLine=6356999;
 //BA.debugLineNum = 6356999;BA.debugLine="CallSub3(CallBack, EventName & \"_ItemLongClick\",";
__c.CallSubNew3(ba,__ref._callback /*Object*/ ,__ref._eventname /*String*/ +"_ItemLongClick",_senderpanel.getTag(),__ref._getrawlistitem /*anetocalcV4.cerolab.customlistview._clvitem*/ (null,(int)(BA.ObjectToNumber(_senderpanel.getTag()))).Value /*Object*/ );
 };
RDebugUtils.currentLine=6357001;
 //BA.debugLineNum = 6357001;BA.debugLine="End Sub";
return "";
}
public String  _removeat(anetocalcV4.cerolab.customlistview __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "removeat", false))
	 {return ((String) Debug.delegate(ba, "removeat", new Object[] {_index}));}
anetocalcV4.cerolab.customlistview._clvitem _removeitem = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
int _i = 0;
anetocalcV4.cerolab.customlistview._clvitem _item = null;
int _newoffset = 0;
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Public Sub RemoveAt(Index As Int)";
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="If getSize <= 1 Then";
if (__ref._getsize /*int*/ (null)<=1) { 
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="Clear";
__ref._clear /*String*/ (null);
RDebugUtils.currentLine=4915203;
 //BA.debugLineNum = 4915203;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=4915205;
 //BA.debugLineNum = 4915205;BA.debugLine="Dim RemoveItem As CLVItem = items.Get(Index)";
_removeitem = (anetocalcV4.cerolab.customlistview._clvitem)(__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .Get(_index));
RDebugUtils.currentLine=4915206;
 //BA.debugLineNum = 4915206;BA.debugLine="Dim p As B4XView";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=4915207;
 //BA.debugLineNum = 4915207;BA.debugLine="For i = Index + 1 To items.Size - 1";
{
final int step7 = 1;
final int limit7 = (int) (__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (_index+1) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
RDebugUtils.currentLine=4915208;
 //BA.debugLineNum = 4915208;BA.debugLine="Dim item As CLVItem = items.Get(i)";
_item = (anetocalcV4.cerolab.customlistview._clvitem)(__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=4915209;
 //BA.debugLineNum = 4915209;BA.debugLine="p = item.Panel";
_p = _item.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=4915210;
 //BA.debugLineNum = 4915210;BA.debugLine="p.Tag = i - 1";
_p.setTag((Object)(_i-1));
RDebugUtils.currentLine=4915211;
 //BA.debugLineNum = 4915211;BA.debugLine="Dim NewOffset As Int = item.Offset - RemoveItem.";
_newoffset = (int) (_item.Offset /*int*/ -_removeitem.Size /*int*/ -__ref._mdividersize /*float*/ );
RDebugUtils.currentLine=4915212;
 //BA.debugLineNum = 4915212;BA.debugLine="SetItemOffset(item, NewOffset)";
__ref._setitemoffset /*String*/ (null,_item,(float) (_newoffset));
 }
};
RDebugUtils.currentLine=4915214;
 //BA.debugLineNum = 4915214;BA.debugLine="SetScrollViewContentSize(GetScrollViewContentSize";
__ref._setscrollviewcontentsize /*String*/ (null,(float) (__ref._getscrollviewcontentsize /*float*/ (null)-_removeitem.Size /*int*/ -__ref._mdividersize /*float*/ ));
RDebugUtils.currentLine=4915215;
 //BA.debugLineNum = 4915215;BA.debugLine="items.RemoveAt(Index)";
__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_index);
RDebugUtils.currentLine=4915216;
 //BA.debugLineNum = 4915216;BA.debugLine="RemoveItem.Panel.RemoveViewFromParent";
_removeitem.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=4915217;
 //BA.debugLineNum = 4915217;BA.debugLine="End Sub";
return "";
}
public String  _replaceat(anetocalcV4.cerolab.customlistview __ref,int _index,anywheresoftware.b4a.objects.B4XViewWrapper _pnl,int _itemsize,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "replaceat", false))
	 {return ((String) Debug.delegate(ba, "replaceat", new Object[] {_index,_pnl,_itemsize,_value}));}
anetocalcV4.cerolab.customlistview._clvitem _removeitem = null;
RDebugUtils.currentLine=5767168;
 //BA.debugLineNum = 5767168;BA.debugLine="Public Sub ReplaceAt(Index As Int, pnl As B4XView,";
RDebugUtils.currentLine=5767169;
 //BA.debugLineNum = 5767169;BA.debugLine="Dim RemoveItem As CLVItem = items.Get(Index)";
_removeitem = (anetocalcV4.cerolab.customlistview._clvitem)(__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .Get(_index));
RDebugUtils.currentLine=5767170;
 //BA.debugLineNum = 5767170;BA.debugLine="items.RemoveAt(Index)";
__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_index);
RDebugUtils.currentLine=5767171;
 //BA.debugLineNum = 5767171;BA.debugLine="RemoveItem.Panel.RemoveViewFromParent";
_removeitem.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=5767172;
 //BA.debugLineNum = 5767172;BA.debugLine="InsertAtImpl(Index, pnl, ItemSize, Value, RemoveI";
__ref._insertatimpl /*String*/ (null,_index,_pnl,_itemsize,_value,_removeitem.Size /*int*/ );
RDebugUtils.currentLine=5767173;
 //BA.debugLineNum = 5767173;BA.debugLine="End Sub";
return "";
}
public String  _resizeitem(anetocalcV4.cerolab.customlistview __ref,int _index,int _itemsize) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "resizeitem", false))
	 {return ((String) Debug.delegate(ba, "resizeitem", new Object[] {_index,_itemsize}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
Object _value = null;
anywheresoftware.b4a.objects.B4XViewWrapper _parent = null;
RDebugUtils.currentLine=5701632;
 //BA.debugLineNum = 5701632;BA.debugLine="Public Sub ResizeItem(Index As Int, ItemSize As In";
RDebugUtils.currentLine=5701633;
 //BA.debugLineNum = 5701633;BA.debugLine="Dim p As B4XView = GetPanel(Index)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_index);
RDebugUtils.currentLine=5701634;
 //BA.debugLineNum = 5701634;BA.debugLine="Dim value As Object = GetValue(Index)";
_value = __ref._getvalue /*Object*/ (null,_index);
RDebugUtils.currentLine=5701635;
 //BA.debugLineNum = 5701635;BA.debugLine="Dim parent As B4XView = p.Parent";
_parent = new anywheresoftware.b4a.objects.B4XViewWrapper();
_parent = _p.getParent();
RDebugUtils.currentLine=5701636;
 //BA.debugLineNum = 5701636;BA.debugLine="p.Color = parent.Color";
_p.setColor(_parent.getColor());
RDebugUtils.currentLine=5701637;
 //BA.debugLineNum = 5701637;BA.debugLine="p.RemoveViewFromParent";
_p.RemoveViewFromParent();
RDebugUtils.currentLine=5701638;
 //BA.debugLineNum = 5701638;BA.debugLine="ReplaceAt(Index, p, ItemSize, value)";
__ref._replaceat /*String*/ (null,_index,_p,_itemsize,_value);
RDebugUtils.currentLine=5701639;
 //BA.debugLineNum = 5701639;BA.debugLine="End Sub";
return "";
}
public String  _scrollhandler(anetocalcV4.cerolab.customlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "scrollhandler", false))
	 {return ((String) Debug.delegate(ba, "scrollhandler", null));}
int _position = 0;
RDebugUtils.currentLine=6553600;
 //BA.debugLineNum = 6553600;BA.debugLine="Private Sub ScrollHandler";
RDebugUtils.currentLine=6553601;
 //BA.debugLineNum = 6553601;BA.debugLine="If items.Size = 0 Then Return";
if (__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=6553602;
 //BA.debugLineNum = 6553602;BA.debugLine="Dim position As Int = GetScrollViewOffset";
_position = (int) (__ref._getscrollviewoffset /*float*/ (null));
RDebugUtils.currentLine=6553603;
 //BA.debugLineNum = 6553603;BA.debugLine="If position + GetScrollViewVisibleSize >= GetScro";
if (_position+__ref._getscrollviewvisiblesize /*float*/ (null)>=__ref._getscrollviewcontentsize /*float*/ (null)-__c.DipToCurrent((int) (5)) && __c.DateTime.getNow()>__ref._lastreachendevent /*long*/ +100) { 
RDebugUtils.currentLine=6553604;
 //BA.debugLineNum = 6553604;BA.debugLine="If xui.SubExists(CallBack, EventName & \"_ReachEn";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._callback /*Object*/ ,__ref._eventname /*String*/ +"_ReachEnd",(int) (0))) { 
RDebugUtils.currentLine=6553605;
 //BA.debugLineNum = 6553605;BA.debugLine="LastReachEndEvent = DateTime.Now";
__ref._lastreachendevent /*long*/  = __c.DateTime.getNow();
RDebugUtils.currentLine=6553606;
 //BA.debugLineNum = 6553606;BA.debugLine="CallSubDelayed(CallBack, EventName & \"_ReachEnd";
__c.CallSubDelayed(ba,__ref._callback /*Object*/ ,__ref._eventname /*String*/ +"_ReachEnd");
 }else {
RDebugUtils.currentLine=6553608;
 //BA.debugLineNum = 6553608;BA.debugLine="LastReachEndEvent = DateTime.Now + 1000 * DateT";
__ref._lastreachendevent /*long*/  = (long) (__c.DateTime.getNow()+1000*__c.DateTime.TicksPerDay);
 };
 };
RDebugUtils.currentLine=6553611;
 //BA.debugLineNum = 6553611;BA.debugLine="UpdateVisibleRange";
__ref._updatevisiblerange /*String*/ (null);
RDebugUtils.currentLine=6553612;
 //BA.debugLineNum = 6553612;BA.debugLine="If FireScrollChanged Then";
if (__ref._firescrollchanged /*boolean*/ ) { 
RDebugUtils.currentLine=6553613;
 //BA.debugLineNum = 6553613;BA.debugLine="CallSub2(CallBack, EventName & \"_ScrollChanged\",";
__c.CallSubNew2(ba,__ref._callback /*Object*/ ,__ref._eventname /*String*/ +"_ScrollChanged",(Object)(_position));
 };
RDebugUtils.currentLine=6553615;
 //BA.debugLineNum = 6553615;BA.debugLine="End Sub";
return "";
}
public String  _scrolltoitem(anetocalcV4.cerolab.customlistview __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "scrolltoitem", false))
	 {return ((String) Debug.delegate(ba, "scrolltoitem", new Object[] {_index}));}
float _offset = 0f;
anywheresoftware.b4a.objects.HorizontalScrollViewWrapper _hv = null;
anywheresoftware.b4a.objects.ScrollViewWrapper _nsv = null;
RDebugUtils.currentLine=6029312;
 //BA.debugLineNum = 6029312;BA.debugLine="Public Sub ScrollToItem(Index As Int)";
RDebugUtils.currentLine=6029313;
 //BA.debugLineNum = 6029313;BA.debugLine="Dim offset As Float = Min(GetMaxScrollOffset, Fin";
_offset = (float) (__c.Min(__ref._getmaxscrolloffset /*float*/ (null),__ref._finditemoffset /*int*/ (null,_index)));
RDebugUtils.currentLine=6029325;
 //BA.debugLineNum = 6029325;BA.debugLine="If horizontal Then";
if (__ref._horizontal /*boolean*/ ) { 
RDebugUtils.currentLine=6029326;
 //BA.debugLineNum = 6029326;BA.debugLine="Dim hv As HorizontalScrollView = sv";
_hv = new anywheresoftware.b4a.objects.HorizontalScrollViewWrapper();
_hv.setObject((android.widget.HorizontalScrollView)(__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=6029327;
 //BA.debugLineNum = 6029327;BA.debugLine="hv.ScrollPosition = offset 'smooth scroll";
_hv.setScrollPosition((int) (_offset));
 }else {
RDebugUtils.currentLine=6029329;
 //BA.debugLineNum = 6029329;BA.debugLine="Dim nsv As ScrollView = sv";
_nsv = new anywheresoftware.b4a.objects.ScrollViewWrapper();
_nsv.setObject((android.widget.ScrollView)(__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=6029330;
 //BA.debugLineNum = 6029330;BA.debugLine="nsv.ScrollPosition = offset";
_nsv.setScrollPosition((int) (_offset));
 };
RDebugUtils.currentLine=6029333;
 //BA.debugLineNum = 6029333;BA.debugLine="End Sub";
return "";
}
public String  _sv_scrollchanged(anetocalcV4.cerolab.customlistview __ref,int _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
if (Debug.shouldDelegate(ba, "sv_scrollchanged", false))
	 {return ((String) Debug.delegate(ba, "sv_scrollchanged", new Object[] {_position}));}
RDebugUtils.currentLine=6946816;
 //BA.debugLineNum = 6946816;BA.debugLine="Private Sub sv_ScrollChanged(Position As Int)";
RDebugUtils.currentLine=6946817;
 //BA.debugLineNum = 6946817;BA.debugLine="ScrollHandler";
__ref._scrollhandler /*String*/ (null);
RDebugUtils.currentLine=6946818;
 //BA.debugLineNum = 6946818;BA.debugLine="End Sub";
return "";
}
}