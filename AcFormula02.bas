﻿B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=9.5
@EndOfDesignText@
'
' Formula 02 Caluculo Micras
'

#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Public A,B,C,D As Float = 0
	
	Private EtA As EditText
	Private EtB As EditText	
	Private LbResult As Label
	Private LbTitulo As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
	Activity.LoadLayout("LyFormula02")
End Sub


'Modifican algún valor
Sub EtA_TextChanged (Old As String, New As String)
	If New = "" Or New="." Then
		A=0
	Else
		A=New
	End If
	LbResult.Text = clacula01
End Sub

Sub EtB_TextChanged (Old As String, New As String)
	If New = "" Or New="." Then
		B=0
	Else
		B=New
	End If
	LbResult.Text = clacula01
End Sub


Sub Activity_Resume
	Log("Formula02 Activity_Resume")
End Sub

Sub Activity_Pause (UserClosed As Boolean)
	Log("Formula02 Activity_Pause")
End Sub



Sub clacula01 As String
	'CALCULO METROS
	'Fórmula= A / (3*0,92*B)*100
	Dim cal As Float
	
	' Validaciones
	If B > 9999 Then
		B=9999
		EtB.Text=B
	End If	
	
	If A=0 And B=0 And C=0 Then
		Return(0)
	End If
	
	'Calculo
	cal=(A/(3*0.92*B)*100)
	Log("calculo=" &  cal)
	
	If cal="-Infinity" Or cal="Infinity" Then
		Return("0")
	End If
	
	Return(NumberFormat (cal,0,2))
End Sub

'Limpiar valores Onfocus
Sub EtA_FocusChanged (HasFocus As Boolean)
	If HasFocus Then EtA.Text=""
End Sub
Sub EtB_FocusChanged (HasFocus As Boolean)
	If HasFocus Then EtB.Text=""
End Sub
