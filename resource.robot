*** Settings ***
Library           SeleniumLibrary
Suite Teardown    Close Browser

*** Variables ***
${URL}         http://localhost:3000/webapp/xo.jsp
${BROWSER}     chrome

*** Keywords ***
เปิดหน้าเกม XO
    Open Browser    ${URL}   ${BROWSER}

คลิ๊กตำแหน่ง แถว 1 คอลั่ม 1
    Click Element   id=R1_C1
    Wait Until Element Contains     id=R1_C1

คลิ๊กตำแหน่ง แถว 2 คอลั่ม 1
    Click Element   id=R2_C1
    Wait Until Element Contains     id=R2_C1

คลิ๊กตำแหน่ง แถว 3 คอลั่ม 1
    Click Element   id=R3_C1
    Wait Until Element Contains     id=R3_C1

คลิ๊กตำแหน่ง แถว 1 คอลั่ม 2
    Click Element   id=R1_C2
    Wait Until Element Contains     id=R1_C2

คลิ๊กตำแหน่ง แถว 2 คอลั่ม 2
    Click Element   id=R2_C2
    Wait Until Element Contains     id=R2_C2

คลิ๊กตำแหน่ง แถว 3 คอลั่ม 2
    Click Element   id=R3_C2
    Wait Until Element Contains     id=R3_C2

คลิ๊กตำแหน่ง แถว 1 คอลั่ม 3
    Click Element   id=R1_C3
    Wait Until Element Contains     id=R1_C3

คลิ๊กตำแหน่ง แถว 2 คอลั่ม 3
    Click Element   id=R2_C3
    Wait Until Element Contains     id=R2_C3

คลิ๊กตำแหน่ง แถว 3 คอลั่ม 3
    Click Element   id=R3_C3
    Wait Until Element Contains     id=R3_C3

แสดงผล ผู้ชนะ
    Wait Until Element Contains     id=play

แสดงผล การเสมอ
    Wait Until Element Contains     id=tie

# ขึ้นคำถามจะเล่นต่อหรือไม่?