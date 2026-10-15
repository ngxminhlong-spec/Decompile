package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class F3 {
    public static final ConditionVariable c = new ConditionVariable();
    public static volatile Or d = null;

    /* renamed from: e, reason: collision with root package name */
    public static volatile Random f4973e = null;

    /* renamed from: a, reason: collision with root package name */
    public final U3 f4974a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Boolean f4975b;

    public F3(U3 u32) {
        this.f4974a = u32;
        u32.f7128b.execute(new D3(1, this));
    }

    public final void a(int i4, int i5, long j4, String str, Exception exc) {
        try {
            c.block();
            if (!this.f4975b.booleanValue() || d == null) {
                return;
            }
            Z2 v4 = C0507d3.v();
            String packageName = this.f4974a.f7127a.getPackageName();
            v4.d();
            C0507d3.B((C0507d3) v4.f4561p, packageName);
            v4.d();
            C0507d3.w((C0507d3) v4.f4561p, j4);
            if (str != null) {
                v4.d();
                C0507d3.z((C0507d3) v4.f4561p, str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                String stringWriter2 = stringWriter.toString();
                v4.d();
                C0507d3.x((C0507d3) v4.f4561p, stringWriter2);
                String name = exc.getClass().getName();
                v4.d();
                C0507d3.y((C0507d3) v4.f4561p, name);
            }
            Or or = d;
            byte[] e4 = ((C0507d3) v4.b()).e();
            or.getClass();
            O2 o22 = new O2(or, e4);
            o22.f6432b = i4;
            if (i5 != -1) {
                o22.f6431a = i5;
            }
            o22.c();
        } catch (Exception unused) {
        }
    }
}
