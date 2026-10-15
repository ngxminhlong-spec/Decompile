package com.google.android.gms.internal.ads;

import android.content.Context;
import android.widget.FrameLayout;
import c3.InterfaceFutureC0239a;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Uo {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7186a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f7187b;
    public final C1423ye c;
    public final To d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0876lp f7188e;

    /* renamed from: f, reason: collision with root package name */
    public final C0248Bc f7189f;

    /* renamed from: g, reason: collision with root package name */
    public final FrameLayout f7190g;

    /* renamed from: h, reason: collision with root package name */
    public final Fq f7191h;

    /* renamed from: i, reason: collision with root package name */
    public final Ip f7192i;

    /* renamed from: j, reason: collision with root package name */
    public InterfaceFutureC0239a f7193j;

    public Uo(Context context, Executor executor, C1423ye c1423ye, InterfaceC0876lp interfaceC0876lp, To to, Ip ip, C0248Bc c0248Bc) {
        this.f7186a = context;
        this.f7187b = executor;
        this.c = c1423ye;
        this.f7188e = interfaceC0876lp;
        this.d = to;
        this.f7192i = ip;
        this.f7189f = c0248Bc;
        this.f7190g = new FrameLayout(context);
        this.f7191h = c1423ye.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004b A[Catch: all -> 0x0027, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0027, blocks: (B:39:0x0011, B:11:0x004b, B:22:0x0073, B:24:0x007b, B:27:0x00a6, B:29:0x00aa), top: B:38:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005d A[Catch: all -> 0x0107, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0107, blocks: (B:3:0x0001, B:7:0x002c, B:15:0x005d, B:19:0x0063, B:25:0x008f, B:30:0x00b7, B:37:0x0044), top: B:2:0x0001 }] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, com.google.android.gms.internal.ads.So] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean a(O1.U0 r9, java.lang.String r10, com.google.android.gms.internal.ads.Zf r11, com.google.android.gms.internal.ads.Gn r12) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Uo.a(O1.U0, java.lang.String, com.google.android.gms.internal.ads.Zf, com.google.android.gms.internal.ads.Gn):boolean");
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, com.google.android.gms.internal.ads.zg] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, com.google.android.gms.internal.ads.zg] */
    public final synchronized C0244Ae b(InterfaceC0790jp interfaceC0790jp) {
        So so = (So) interfaceC0790jp;
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f7)).booleanValue()) {
            ?? obj = new Object();
            obj.f11620a = this.f7186a;
            obj.f11621b = so.f7009a;
            C1468zg c1468zg = new C1468zg(obj);
            Ch ch = new Ch();
            ch.f4498l.add(new Ph(this.d, this.f7187b));
            ch.d(this.d, this.f7187b);
            Dh dh = new Dh(ch);
            C0244Ae c0244Ae = new C0244Ae(this.c.f11395b, 0);
            c0244Ae.f3966f = c1468zg;
            c0244Ae.f3965e = dh;
            return c0244Ae;
        }
        To to = this.d;
        To to2 = new To(to.f7080o);
        to2.f7087v = to;
        Ch ch2 = new Ch();
        ch2.a(to2, this.f7187b);
        ch2.f4493g.add(new Ph(to2, this.f7187b));
        ch2.f4500n.add(new Ph(to2, this.f7187b));
        ch2.f4499m.add(new Ph(to2, this.f7187b));
        ch2.f4498l.add(new Ph(to2, this.f7187b));
        ch2.d(to2, this.f7187b);
        ch2.f4501o = to2;
        ?? obj2 = new Object();
        obj2.f11620a = this.f7186a;
        obj2.f11621b = so.f7009a;
        C1468zg c1468zg2 = new C1468zg(obj2);
        Dh dh2 = new Dh(ch2);
        C0244Ae c0244Ae2 = new C0244Ae(this.c.f11395b, 0);
        c0244Ae2.f3966f = c1468zg2;
        c0244Ae2.f3965e = dh2;
        return c0244Ae2;
    }
}
