package o2;

import dalvik.system.PathClassLoader;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: o2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1896g extends PathClassLoader {
    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z4) {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z4);
    }
}
