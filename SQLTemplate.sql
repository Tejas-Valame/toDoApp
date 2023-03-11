/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  Valame
 * Created: 11-Mar-2023
 */

CREATE DATABASE IF NOT EXISTS tododb;

CREATE USER IF NOT EXISTS 'todo_app'@'%' IDENTIFIED BY 'password';

GRANT ALL PRIVILEGES ON tododb.* TO 'todo_app'@'%'; 
