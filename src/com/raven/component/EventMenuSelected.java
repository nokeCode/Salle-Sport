/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.raven.component;

/**
 *
 * @author Gerùain
 */
@FunctionalInterface // Optionnel, mais recommandé pour garantir qu'il s'agit d'une interface fonctionnelle
public interface EventMenuSelected {
    void onMenuSelected(int index);
}
