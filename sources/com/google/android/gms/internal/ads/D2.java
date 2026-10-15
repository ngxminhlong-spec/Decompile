package com.google.android.gms.internal.ads;

import H.C0034i;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class D2 implements Comparable {

    /* renamed from: o, reason: collision with root package name */
    public final H2 f4571o;

    /* renamed from: p, reason: collision with root package name */
    public final int f4572p;

    /* renamed from: q, reason: collision with root package name */
    public final String f4573q;

    /* renamed from: r, reason: collision with root package name */
    public final int f4574r;

    /* renamed from: s, reason: collision with root package name */
    public final Object f4575s;

    /* renamed from: t, reason: collision with root package name */
    public final E2 f4576t;

    /* renamed from: u, reason: collision with root package name */
    public Integer f4577u;

    /* renamed from: v, reason: collision with root package name */
    public O1.A0 f4578v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f4579w;

    /* renamed from: x, reason: collision with root package name */
    public C1190t2 f4580x;
    public u0.g y;

    /* renamed from: z, reason: collision with root package name */
    public final C0034i f4581z;

    /* JADX WARN: Type inference failed for: r3v1, types: [H.i, java.lang.Object] */
    public D2(int i4, String str, E2 e22) {
        Uri parse;
        String host;
        this.f4571o = H2.c ? new H2() : null;
        this.f4575s = new Object();
        int i5 = 0;
        this.f4579w = false;
        this.f4580x = null;
        this.f4572p = i4;
        this.f4573q = str;
        this.f4576t = e22;
        ?? obj = new Object();
        obj.f824a = 2500;
        this.f4581z = obj;
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && (host = parse.getHost()) != null) {
            i5 = host.hashCode();
        }
        this.f4574r = i5;
    }

    public abstract B0.c a(B2 b22);

    public final String b() {
        int i4 = this.f4572p;
        String str = this.f4573q;
        return i4 != 0 ? n0.a.i(Integer.toString(1), "-", str) : str;
    }

    public Map c() {
        return Collections.EMPTY_MAP;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f4577u.intValue() - ((D2) obj).f4577u.intValue();
    }

    public final void d(String str) {
        if (H2.c) {
            this.f4571o.a(str, Thread.currentThread().getId());
        }
    }

    public abstract void e(Object obj);

    public final void f(String str) {
        O1.A0 a02 = this.f4578v;
        if (a02 != null) {
            synchronized (((HashSet) a02.f1254b)) {
                ((HashSet) a02.f1254b).remove(this);
            }
            synchronized (((ArrayList) a02.f1259i)) {
                Iterator it = ((ArrayList) a02.f1259i).iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            }
            a02.c();
        }
        if (H2.c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0758j(1, id, this, str, false));
            } else {
                this.f4571o.a(str, id);
                this.f4571o.b(toString());
            }
        }
    }

    public final void g() {
        u0.g gVar;
        synchronized (this.f4575s) {
            gVar = this.y;
        }
        if (gVar != null) {
            gVar.q(this);
        }
    }

    public final void h(B0.c cVar) {
        u0.g gVar;
        synchronized (this.f4575s) {
            gVar = this.y;
        }
        if (gVar != null) {
            gVar.v(this, cVar);
        }
    }

    public final void i() {
        O1.A0 a02 = this.f4578v;
        if (a02 != null) {
            a02.c();
        }
    }

    public final void j(u0.g gVar) {
        synchronized (this.f4575s) {
            this.y = gVar;
        }
    }

    public final boolean k() {
        boolean z4;
        synchronized (this.f4575s) {
            z4 = this.f4579w;
        }
        return z4;
    }

    public final void l() {
        synchronized (this.f4575s) {
        }
    }

    public byte[] m() {
        return null;
    }

    public final String toString() {
        String valueOf = String.valueOf(Integer.toHexString(this.f4574r));
        l();
        return "[ ] " + this.f4573q + " " + "0x".concat(valueOf) + " NORMAL " + this.f4577u;
    }
}
