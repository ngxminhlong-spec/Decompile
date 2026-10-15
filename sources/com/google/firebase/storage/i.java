package com.google.firebase.storage;

import java.lang.ref.WeakReference;
import java.util.HashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class i {
    public static final i c = new i();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f12570a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Object f12571b = new Object();

    public final void a(h hVar) {
        synchronized (this.f12571b) {
            this.f12570a.put(((m) hVar).f12581l.toString(), new WeakReference(hVar));
        }
    }

    public final void b(h hVar) {
        synchronized (this.f12571b) {
            try {
                String eVar = ((m) hVar).f12581l.toString();
                WeakReference weakReference = (WeakReference) this.f12570a.get(eVar);
                h hVar2 = weakReference != null ? (h) weakReference.get() : null;
                if (hVar2 == null || hVar2 == hVar) {
                    this.f12570a.remove(eVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
