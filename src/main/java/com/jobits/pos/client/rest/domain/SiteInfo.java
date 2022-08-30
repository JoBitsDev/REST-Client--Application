/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobits.pos.client.rest.domain;

import java.util.HashMap;
import java.util.Map;

/**
 * JoBits
 *
 * @author Jorge
 */
public class SiteInfo {//TODO: cada modulo debe agregar al siteinfor general su informacion y solo existir un siteinfo como servicio

    public static final SiteInfo INSTANCE = new SiteInfo();
    private final int Mayor_Version = 9;
    private final int Minor_Version = 0;
    private final int Patch_Version = 0;
    private final Map<String, String> endpointMap = new HashMap<>();

    private SiteInfo() {
        for (EndpointMap v : EndpointMap.values()) {
            endpointMap.put(v.getNombre(), v.getPath());
        }
    }

    public static SiteInfo getINSTANCE() {
        return INSTANCE;
    }

    public int getMayor_Version() {
        return Mayor_Version;
    }

    public int getMinor_Version() {
        return Minor_Version;
    }

    public int getPatch_Version() {
        return Patch_Version;
    }

    public Map<String, String> getEndpointMap() {
        return endpointMap;
    }

    public enum EndpointMap {
        ORDEN("Ordenes", "/orden");

        private final String nombre, path;

        private EndpointMap(String nombre, String path) {
            this.nombre = nombre;
            this.path = path;
        }

        public String getNombre() {
            return nombre;
        }

        public String getPath() {
            return path;
        }

    }

}
