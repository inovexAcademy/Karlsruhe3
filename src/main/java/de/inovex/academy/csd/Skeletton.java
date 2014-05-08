/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.inovex.academy.csd;

/**
 *
 * @author Torsten
 */
public class Skeletton {

	public static void main(String... args) {
		if (args.length != 1) {
			throw new IllegalArgumentException("Ein Parameter bitte");
		}
		System.out.println(String.format("Hallo %s from Java", args[0]));
	}
}
