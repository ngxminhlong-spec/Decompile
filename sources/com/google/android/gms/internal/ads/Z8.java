package com.google.android.gms.internal.ads;

import android.content.Context;
import b0.RunnableC0203p;
import java.util.concurrent.atomic.AtomicInteger;
import y3.C2120a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Z8 {

    /* renamed from: a, reason: collision with root package name */
    public String f7964a;

    /* renamed from: b, reason: collision with root package name */
    public int f7965b;
    public Object c;
    public Object d;

    /* renamed from: e, reason: collision with root package name */
    public Object f7966e;

    /* renamed from: f, reason: collision with root package name */
    public Object f7967f;

    /* renamed from: g, reason: collision with root package name */
    public Object f7968g;

    public C2120a a() {
        String str = this.f7965b == 0 ? " registrationStatus" : "";
        if (((Long) this.f7966e) == null) {
            str = str.concat(" expiresInSecs");
        }
        if (((Long) this.f7967f) == null) {
            str = n0.a.h(str, " tokenCreationEpochInSecs");
        }
        if (str.isEmpty()) {
            return new C2120a(this.f7964a, this.f7965b, (String) this.c, (String) this.d, ((Long) this.f7966e).longValue(), ((Long) this.f7967f).longValue(), (String) this.f7968g);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public X8 b() {
        Q1.I.w("getEngine: Trying to acquire lock");
        synchronized (this.c) {
            try {
                Q1.I.w("getEngine: Lock acquired");
                Q1.I.w("refreshIfDestroyed: Trying to acquire lock");
                synchronized (this.c) {
                    try {
                        Q1.I.w("refreshIfDestroyed: Lock acquired");
                        Y8 y8 = (Y8) this.f7968g;
                        if (y8 != null && this.f7965b == 0) {
                            y8.m(new M3(12, this), BF.f4078w);
                        }
                    } finally {
                    }
                }
                Q1.I.w("refreshIfDestroyed: Lock released");
                Y8 y82 = (Y8) this.f7968g;
                if (y82 != null && ((AtomicInteger) y82.f5575b).get() != -1) {
                    int i4 = this.f7965b;
                    if (i4 == 0) {
                        Q1.I.w("getEngine (NO_UPDATE): Lock released");
                        return ((Y8) this.f7968g).n();
                    }
                    if (i4 != 1) {
                        Q1.I.w("getEngine (UPDATING): Lock released");
                        return ((Y8) this.f7968g).n();
                    }
                    this.f7965b = 2;
                    c();
                    Q1.I.w("getEngine (PENDING_UPDATE): Lock released");
                    return ((Y8) this.f7968g).n();
                }
                this.f7965b = 2;
                this.f7968g = c();
                Q1.I.w("getEngine (NULL or REJECTED): Lock released");
                return ((Y8) this.f7968g).n();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Y8 c() {
        Aq f4 = Zf.f((Context) this.d, 6);
        f4.f();
        Y8 y8 = new Y8();
        Q1.I.w("loadJavascriptEngine > Before UI_THREAD_EXECUTOR");
        AbstractC0266Ec.f4899e.execute(new RunnableC0203p(7, this, y8));
        Q1.I.w("loadNewJavascriptEngine: Promise created");
        y8.m(new T8(this, y8, f4), new T8(this, y8, f4));
        return y8;
    }
}
