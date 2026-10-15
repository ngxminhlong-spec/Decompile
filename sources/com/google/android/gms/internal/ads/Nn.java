package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import c3.InterfaceFutureC0239a;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Nn implements Go {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6386a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Su f6387b;
    public final Context c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f6388e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f6389f;

    public Nn(Context context, C1035pc c1035pc, ScheduledExecutorService scheduledExecutorService, Su su) {
        if (!((Boolean) O1.r.d.c.a(AbstractC1066q6.f10274q2)).booleanValue()) {
            this.f6388e = new Qw(context, 15);
        }
        this.c = context;
        this.d = c1035pc;
        this.f6389f = scheduledExecutorService;
        this.f6387b = su;
    }

    public Nn(Su su, Su su2, Context context, Jp jp, ViewGroup viewGroup) {
        this.f6387b = su;
        this.d = su2;
        this.c = context;
        this.f6388e = jp;
        this.f6389f = viewGroup;
    }

    public ArrayList a() {
        ArrayList arrayList = new ArrayList();
        View view = (ViewGroup) this.f6389f;
        while (view != null) {
            Object parent = view.getParent();
            if (parent == null) {
                break;
            }
            int indexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", indexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.Go
    public final int b() {
        switch (this.f6386a) {
            case 0:
                return 3;
            default:
                return 11;
        }
    }

    @Override // com.google.android.gms.internal.ads.Go
    public final InterfaceFutureC0239a c() {
        A2.h f4;
        switch (this.f6386a) {
            case 0:
                AbstractC1066q6.a(this.c);
                if (((Boolean) O1.r.d.c.a(AbstractC1066q6.r9)).booleanValue()) {
                    final int i4 = 0;
                    return ((C0260Dc) ((Su) this.d)).b(new Callable(this) { // from class: com.google.android.gms.internal.ads.Mn

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ Nn f6271b;

                        {
                            this.f6271b = this;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            switch (i4) {
                                case 0:
                                    Nn nn = this.f6271b;
                                    return new Pn(nn.c, ((Jp) nn.f6388e).f5910e, nn.a(), 0);
                                default:
                                    Nn nn2 = this.f6271b;
                                    return new Pn(nn2.c, ((Jp) nn2.f6388e).f5910e, nn2.a(), 0);
                            }
                        }
                    });
                }
                final int i5 = 1;
                return ((C0260Dc) this.f6387b).b(new Callable(this) { // from class: com.google.android.gms.internal.ads.Mn

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Nn f6271b;

                    {
                        this.f6271b = this;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        switch (i5) {
                            case 0:
                                Nn nn = this.f6271b;
                                return new Pn(nn.c, ((Jp) nn.f6388e).f5910e, nn.a(), 0);
                            default:
                                Nn nn2 = this.f6271b;
                                return new Pn(nn2.c, ((Jp) nn2.f6388e).f5910e, nn2.a(), 0);
                        }
                    }
                });
            default:
                C0937n6 c0937n6 = AbstractC1066q6.f10255m2;
                O1.r rVar = O1.r.d;
                if (((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
                    if (!((Boolean) rVar.c.a(AbstractC1066q6.f10278r2)).booleanValue()) {
                        if (!((Boolean) rVar.c.a(AbstractC1066q6.f10260n2)).booleanValue()) {
                            return Bs.m0(Zf.h(((Qw) this.f6388e).f()), C0932n1.f9702l, AbstractC0266Ec.f4900f);
                        }
                        if (((Boolean) rVar.c.a(AbstractC1066q6.f10274q2)).booleanValue()) {
                            Wj.e(this.c, false);
                            synchronized (Wj.f7555x) {
                                f4 = Wj.f7553v;
                            }
                        } else {
                            f4 = ((Qw) this.f6388e).f();
                        }
                        if (f4 == null) {
                            return Bs.h0(new C0406ao(-1, 0, null));
                        }
                        InterfaceFutureC0239a n02 = Bs.n0(Zf.h(f4), C0364Xe.f7669o, AbstractC0266Ec.f4900f);
                        if (((Boolean) rVar.c.a(AbstractC1066q6.f10265o2)).booleanValue()) {
                            n02 = Bs.o0(n02, ((Long) rVar.c.a(AbstractC1066q6.f10270p2)).longValue(), TimeUnit.MILLISECONDS, (ScheduledExecutorService) this.f6389f);
                        }
                        return Bs.Z(n02, Exception.class, new C0563eb(5, this), this.f6387b);
                    }
                }
                return Bs.h0(new C0406ao(-1, 0, null));
        }
    }
}
