B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=9.5
@EndOfDesignText@
'
' Formula 03 Caluculo PRESTIRO
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
	Public A,B,C,D,E,F,G As Float = 0
	
	Private EtA As EditText
	Private EtB As EditText
	Private EtC As EditText
	Private EtD As EditText
	Private EtE As EditText
	Private EtF As EditText
	
	Private LbResultPalet As Label
	Private LbResult As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
	Activity.LoadLayout("LyFormula03")
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

Sub EtC_TextChanged (Old As String, New As String)
	If New = "" Or New="." Then
		C=0
	Else
		C=New
	End If
	LbResult.Text = clacula01
End Sub

Sub EtD_TextChanged (Old As String, New As String)
	If New = "" Or New="." Then
		D=0
	Else
		D=New
	End If
	LbResult.Text = clacula01
End Sub

Sub EtE_TextChanged (Old As String, New As String)
	If New = "" Or New="." Then
		E=0
	Else
		E=New
	End If
	LbResult.Text = clacula01
End Sub

Sub EtF_TextChanged (Old As String, New As String)
	If New = "" Or New="." Then
		F=0
	Else
		F=New
	End If
	LbResult.Text = clacula01
End Sub


Sub Activity_Resume
	Log("Formula03 Activity_Resume")
End Sub

Sub Activity_Pause (UserClosed As Boolean)
	Log("Formula03 Activity_Pause")
End Sub



Sub clacula01 As String
	'CALCULO PRESTIRO
	'Fórmula: G=(a+b)*2
	'Resultado =(G*C*D*F*0,92/E-1)*100

	Dim cal As Float
	
	' Validaciones
	If B > 9999 Then
		B=9999
		EtB.Text=B
	End If
		
	If A=0 And B=0 Then
		Return(0)
	End If
	
	'Calculo G (Perimetro palet)
	LbResultPalet.Text = claculaG
	'C=C/100
	Log("VALORES: A="&A&"B="&B&"C="&C&"D="&D&"E="&E&"F="&F&"G="&G)
	
	If E=0 Then Return("0.00")	' Evitar dividir x 0
	
	cal=(((G*C*D*F*0.92)/E)-1)*100
	cal=cal+0
	Log("calculo=" & cal)
	
	If cal="-Infinity" Or cal="Infinity" Then
		Return("0.00")
	End If
	
	Return(NumberFormat2(cal,1,2,2,True))
End Sub


Sub claculaG As String
	G=((A/100)+(B/100))*2
	If IsNumber(G)=False Or G="-Infinity" Or G="Infinity" Then
		Return("0")
	End If
	
	Return(NumberFormat2(G,1,1,1,True))
End Sub

'Limpiar valores Onfocus
Sub EtA_FocusChanged (HasFocus As Boolean)
	If HasFocus Then EtA.Text=""
End Sub
Sub EtB_FocusChanged (HasFocus As Boolean)
	If HasFocus Then EtB.Text=""
End Sub
Sub EtC_FocusChanged (HasFocus As Boolean)
	If HasFocus Then EtC.Text=""
End Sub
Sub EtD_FocusChanged (HasFocus As Boolean)
	If HasFocus Then EtD.Text=""
End Sub
Sub EtE_FocusChanged (HasFocus As Boolean)
	If HasFocus Then EtE.Text=""
End Sub
Sub EtF_FocusChanged (HasFocus As Boolean)
	If HasFocus Then EtF.Text=""
End Sub
