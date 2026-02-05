#cs ----------------------------------------------------------------------------

	 AutoIt Version: 3.3.18.0
	 Author:         Krishna

	 Script Function:
		Template AutoIt script.

#ce ----------------------------------------------------------------------------
; -------------------------------
; Multi-Task AutoIt Script
; -------------------------------

; 1. Show welcome message
; MsgBox(0, "AutoIt Script", "Automation Started!")

; 2. Open Notepad
; Run("notepad.exe")
; WinWaitActive("Untitled - Notepad")

; 3. Type text automatically
; Send("Hello, this text is typed by AutoIt.{ENTER}")
; Send("AutoIt can automate multiple tasks easily!{ENTER}")
; Send("This is useful for testing and automation.")

; 4. Wait for 2 seconds
; Sleep(2000)

; 5. Save the file
; Send("^s") ; Ctrl + S
; WinWaitActive("Save As")
; Send("AutoItDemo.txt")
; Send("{ENTER}")

; 6. Close Notepad
; Sleep(1000)
; WinClose("AutoItDemo.txt - Notepad")

; 7. Show completion message
; MsgBox(0, "AutoIt Script", "Automation Completed Successfully!")


#include <Array.au3>

; ==============================
; 1) Creating an Array
; ==============================

Local $arr[3] = ["Java", "Python", "C++"]

MsgBox(0, "Array Created", "Initial Array Created!")

; ==============================
; 2) Access Elements
; ==============================

MsgBox(0, "First Element", "arr[0] = " & $arr[0])

; ==============================
; 3) Change Value
; ==============================

$arr[1] = "AutoIt"
MsgBox(0, "Updated", "arr[1] changed to AutoIt")

; ==============================
; 4) Get Array Size
; ==============================

Local $size = UBound($arr)
MsgBox(0, "Array Size", "Size = " & $size)

; ==============================
; 5) Loop Through Array
; ==============================

ConsoleWrite("----- Array Elements -----" & @CRLF)

For $i = 0 To UBound($arr) - 1
    ConsoleWrite($arr[$i] & @CRLF)
Next

; ==============================
; 6) Add Element (ReDim)
; ==============================

ReDim $arr[4]
$arr[3] = "JavaScript"

MsgBox(0, "New Element Added", "JavaScript added to array")

; Show updated array
_ArrayDisplay($arr, "Updated Array")

; ==============================
; 7) Search in Array
; ==============================

If _ArraySearch($arr, "Python") <> -1 Then
    MsgBox(0, "Search Result", "Python found in array")
Else
    MsgBox(0, "Search Result", "Python NOT found")
EndIf

; ==============================
; Program End
; ==============================

MsgBox(0, "Done", "All operations completed!")


#include <GUIConstantsEx.au3>
GUICreate("Hello World", 200, 100)
GUISetState#include <Array.au3>

; ==============================
; 1) Creating an Array
; ==============================

Local $arr[3] = ["Java", "Python", "C++"]

MsgBox(0, "Array Created", "Initial Array Created!")

; ==============================
; 2) Access Elements
; ==============================

MsgBox(0, "First Element", "arr[0] = " & $arr[0])

; ==============================
; 3) Change Value
; ==============================

$arr[1] = "AutoIt"
MsgBox(0, "Updated", "arr[1] changed to AutoIt")

; ==============================
; 4) Get Array Size
; ==============================

Local $size = UBound($arr)
MsgBox(0, "Array Size", "Size = " & $size)

; ==============================
; 5) Loop Through Array
; ==============================

ConsoleWrite("----- Array Elements -----" & @CRLF)

For $i = 0 To UBound($arr) - 1
    ConsoleWrite($arr[$i] & @CRLF)
Next

; ==============================
; 6) Add Element (ReDim)
; ==============================

ReDim $arr[4]
$arr[3] = "JavaScript"

MsgBox(0, "New Element Added", "JavaScript added to array")

; Show updated array
_ArrayDisplay($arr, "Updated Array")

; ==============================
; 7) Search in Array
; ==============================

If _ArraySearch($arr, "Python") <> -1 Then
    MsgBox(0, "Search Result", "Python found in array")
Else
    MsgBox(0, "Search Result", "Python NOT found")
EndIf

; ==============================
; Program End
; ==============================

MsgBox(0, "Done", "All operations completed!")
#include <Array.au3>

; ==============================
; 1) Creating an Array
; ==============================

Local $arr[3] = ["Java", "Python", "C++"]

MsgBox(0, "Array Created", "Initial Array Created!")

; ==============================
; 2) Access Elements
; ==============================

MsgBox(0, "First Element", "arr[0] = " & $arr[0])

; ==============================
; 3) Change Value
; ==============================

$arr[1] = "AutoIt"
MsgBox(0, "Updated", "arr[1] changed to AutoIt")

; ==============================
; 4) Get Array Size
; ==============================

Local $size = UBound($arr)
MsgBox(0, "Array Size", "Size = " & $size)

; ==============================
; 5) Loop Through Array
; ==============================

ConsoleWrite("----- Array Elements -----" & @CRLF)

For $i = 0 To UBound($arr) - 1
    ConsoleWrite($arr[$i] & @CRLF)
Next

; ==============================
; 6) Add Element (ReDim)
; ==============================

ReDim $arr[4]
$arr[3] = "JavaScript"

MsgBox(0, "New Element Added", "JavaScript added to array")

; Show updated array
_ArrayDisplay($arr, "Updated Array")

; ==============================
; 7) Search in Array
; ==============================

If _ArraySearch($arr, "Python") <> -1 Then
    MsgBox(0, "Search Result", "Python found in array")
Else
    MsgBox(0, "Search Result", "Python NOT found")
EndIf

; ==============================
; Program End
; ==============================

;	====================================
;	test
;	======================================
MsgBox(0, "Done", "All operations completed!")
GUICtrlCreateButton("OK", 70, 50, 60)
GUISetState(@SW_SHOW)
Sleep(2000)


;	=====================
;	Mouse move commands
;	=====================
#include <MsgBoxConstants.au3>

MsgBox(0, "Start", "Mouse will move and click in 3 seconds")
Sleep(3000)

MouseMove(500, 300, 10)
Sleep(500)

MouseClick("left", 500, 300, 1, 10)

MsgBox(0, "Done", "Mouse action completed!")