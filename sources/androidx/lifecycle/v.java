package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f2994a = new LinkedHashMap();

    public final void a() {
        for (s sVar : this.f2994a.values()) {
            HashMap hashMap = sVar.f2991a;
            if (hashMap != null) {
                synchronized (hashMap) {
                    try {
                        for (Object obj : sVar.f2991a.values()) {
                            if (obj instanceof Closeable) {
                                try {
                                    ((Closeable) obj).close();
                                } catch (IOException e4) {
                                    throw new RuntimeException(e4);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
            LinkedHashSet linkedHashSet = sVar.f2992b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    try {
                        for (Closeable closeable : sVar.f2992b) {
                            if (U.a.q(closeable)) {
                                try {
                                    closeable.close();
                                } catch (IOException e5) {
                                    throw new RuntimeException(e5);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
            sVar.a();
        }
        this.f2994a.clear();
    }
}
