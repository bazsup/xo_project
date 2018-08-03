*** Settings ***
Library           SeleniumLibrary
Resource          resource.robot
Suite Teardown    Close Browser

*** Test Cases ***
Player 1 ชนะแนวทะแยง ขวาล่างไปซ้ายบน
    เปิดหน้าเกม XO
    #Player 1
    คลิ๊กตำแหน่ง แถว 2 คอลั่ม 2
    #Player 2
    คลิ๊กตำแหน่ง แถว 2 คอลั่ม 3
    #Player 1
    คลิ๊กตำแหน่ง แถว 3 คอลั่ม 3
    #Player 2
    คลิ๊กตำแหน่ง แถว 1 คอลั่ม 3
    #Player 1
    คลิ๊กตำแหน่ง แถว 1 คอลั่ม 1
    แสดงผล ผู้ชนะ
Player 1 ชนะแนวทะแยง ซ้ายล่างไปขวาบน
    เปิดหน้าเกม XO
    #Player 1
    คลิ๊กตำแหน่ง แถว 3 คอลั่ม 1
    #Player 2
    คลิ๊กตำแหน่ง แถว 2 คอลั่ม 1
    #Player 1
    คลิ๊กตำแหน่ง แถว 2 คอลั่ม 2
    #Player 2
    คลิ๊กตำแหน่ง แถว 1 คอลั่ม 1
    #Player 1
    คลิ๊กตำแหน่ง แถว 1 คอลั่ม 3
    แสดงผล ผู้ชนะ