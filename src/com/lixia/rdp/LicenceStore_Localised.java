/* LicenceStore_Localised.java
 * Component: ProperJavaRDP
 * 
 * Revision: $Revision: 1.1.1.1 $
 * Author: $Author: suvarov $
 * Date: $Date: 2007/03/08 00:26:54 $
 *
 * Copyright (c) 2005 Propero Limited
 *
 * Purpose: Java 1.4 specific extension of LicenceStore class
 */
// Created on 05-Aug-2003

package com.lixia.rdp;

import java.util.prefs.Preferences;


public class LicenceStore_Localised extends LicenceStore {

    public byte[] load_licence(){
        Preferences prefs = Preferences.userNodeForPackage(this.getClass());
        return prefs.getByteArray("licence."+Options.hostname,null);
        
    }
    
    public void save_licence(byte[] databytes){
        Preferences prefs = Preferences.userNodeForPackage(this.getClass());
        prefs.putByteArray("licence."+Options.hostname, databytes);
    }
    
}
