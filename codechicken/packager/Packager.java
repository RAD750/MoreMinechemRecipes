// 
// Decompiled by Procyon v0.5.36
// 

package codechicken.packager;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;

@Retention(RetentionPolicy.RUNTIME)
public @interface Packager {
    String getName() default "@Mod";
    
    String getVersion() default "@Mod";
    
    String[] getClasses() default { "" };
    
    String[] getBaseDirectories();
    
    String[] getForcedClasses() default { "" };
    
    String getObfRelocationDir() default "";
    
    String getManifest() default "/";
    
    String getModInfo() default "/";
}
