package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.b4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0423b4 extends AbstractCallableC0892m4 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8198h = 1;

    /* renamed from: i, reason: collision with root package name */
    public Object f8199i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f8200j;

    public C0423b4(U3 u32, C0549e3 c0549e3, int i4, Context context) {
        super(u32, "y3yRmC/kyT5sblAh6MVmMMe529YDQrbaaQxNMdjlDdcJ+gZ0vSS7aY/hNYvCePEW", "Y0trGqGVEUAa7A3LYgSQFKe4N9h1BuTC7OKFYCHfLSg=", c0549e3, i4, 31);
        this.f8199i = null;
        this.f8200j = context;
    }

    public C0423b4(U3 u32, C0549e3 c0549e3, int i4, View view, Activity activity) {
        super(u32, "XCj6cS5OVeEeObzd394PGDbjTuQh+vSye2UT6221ugsKtO2/oznWOSes2cnebrVR", "/UZ99NhZDGBVc8wZVXmC2wC/MG54XdFcRWhDAwHbwWE=", c0549e3, i4, 62);
        this.f8200j = view;
        this.f8199i = activity;
    }

    private final void c() {
        if (((View) this.f8200j) == null) {
            return;
        }
        Boolean bool = (Boolean) O1.r.d.c.a(AbstractC1066q6.f10222f2);
        boolean booleanValue = bool.booleanValue();
        Object[] objArr = (Object[]) this.f9562e.invoke(null, (View) this.f8200j, (Activity) this.f8199i, bool);
        synchronized (this.d) {
            try {
                C0549e3 c0549e3 = this.d;
                long longValue = ((Long) objArr[0]).longValue();
                c0549e3.d();
                C0977o3.S((C0977o3) c0549e3.f4561p, longValue);
                C0549e3 c0549e32 = this.d;
                long longValue2 = ((Long) objArr[1]).longValue();
                c0549e32.d();
                C0977o3.T((C0977o3) c0549e32.f4561p, longValue2);
                if (booleanValue) {
                    C0549e3 c0549e33 = this.d;
                    String str = (String) objArr[2];
                    c0549e33.d();
                    C0977o3.U((C0977o3) c0549e33.f4561p, str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC0892m4
    public final void a() {
        switch (this.f8198h) {
            case 0:
                c();
                return;
            default:
                C0549e3 c0549e3 = this.d;
                c0549e3.d();
                C0977o3.K0((C0977o3) c0549e3.f4561p, -1L);
                C0549e3 c0549e32 = this.d;
                c0549e32.d();
                C0977o3.L0((C0977o3) c0549e32.f4561p, -1L);
                Context context = (Context) this.f8200j;
                if (context == null) {
                    context = this.f9560a.f7127a;
                }
                if (((List) this.f8199i) == null) {
                    this.f8199i = (List) this.f9562e.invoke(null, context);
                }
                List list = (List) this.f8199i;
                if (list == null || list.size() != 2) {
                    return;
                }
                synchronized (this.d) {
                    C0549e3 c0549e33 = this.d;
                    long longValue = ((Long) ((List) this.f8199i).get(0)).longValue();
                    c0549e33.d();
                    C0977o3.K0((C0977o3) c0549e33.f4561p, longValue);
                    C0549e3 c0549e34 = this.d;
                    long longValue2 = ((Long) ((List) this.f8199i).get(1)).longValue();
                    c0549e34.d();
                    C0977o3.L0((C0977o3) c0549e34.f4561p, longValue2);
                }
                return;
        }
    }
}
