package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.internal.measurement.C1510e1;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Pi {

    /* renamed from: a, reason: collision with root package name */
    public final Oj f6593a;

    /* renamed from: b, reason: collision with root package name */
    public final Aj f6594b;
    public final C1381xf c;
    public final C1041pi d;

    public Pi(Oj oj, Aj aj, C1381xf c1381xf, C1041pi c1041pi) {
        this.f6593a = oj;
        this.f6594b = aj;
        this.c = c1381xf;
        this.d = c1041pi;
    }

    public final View a() {
        C0348Ud a4 = this.f6593a.a(O1.X0.i(), null, null);
        a4.setVisibility(8);
        final int i4 = 0;
        a4.A0("/sendMessageToSdk", new InterfaceC0597f8(this) { // from class: com.google.android.gms.internal.ads.Oi

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ Pi f6487p;

            {
                this.f6487p = this;
            }

            @Override // com.google.android.gms.internal.ads.InterfaceC0597f8
            public final void h(Object obj, Map map) {
                switch (i4) {
                    case 0:
                        this.f6487p.f6594b.b(map);
                        return;
                    case 1:
                        this.f6487p.d.y();
                        return;
                    case 2:
                        InterfaceC0308Md interfaceC0308Md = (InterfaceC0308Md) obj;
                        interfaceC0308Md.H().f8147u = new C1510e1((Object) this.f6487p, (Object) map, 24, false);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (TextUtils.isEmpty(str2)) {
                            interfaceC0308Md.loadData(str, "text/html", "UTF-8");
                            return;
                        } else {
                            interfaceC0308Md.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                            return;
                        }
                    case 3:
                        Y9.r("Showing native ads overlay.");
                        ((InterfaceC0308Md) obj).L().setVisibility(0);
                        this.f6487p.c.f11278t = true;
                        return;
                    default:
                        Y9.r("Hiding native ads overlay.");
                        ((InterfaceC0308Md) obj).L().setVisibility(8);
                        this.f6487p.c.f11278t = false;
                        return;
                }
            }
        });
        final int i5 = 1;
        a4.A0("/adMuted", new InterfaceC0597f8(this) { // from class: com.google.android.gms.internal.ads.Oi

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ Pi f6487p;

            {
                this.f6487p = this;
            }

            @Override // com.google.android.gms.internal.ads.InterfaceC0597f8
            public final void h(Object obj, Map map) {
                switch (i5) {
                    case 0:
                        this.f6487p.f6594b.b(map);
                        return;
                    case 1:
                        this.f6487p.d.y();
                        return;
                    case 2:
                        InterfaceC0308Md interfaceC0308Md = (InterfaceC0308Md) obj;
                        interfaceC0308Md.H().f8147u = new C1510e1((Object) this.f6487p, (Object) map, 24, false);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (TextUtils.isEmpty(str2)) {
                            interfaceC0308Md.loadData(str, "text/html", "UTF-8");
                            return;
                        } else {
                            interfaceC0308Md.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                            return;
                        }
                    case 3:
                        Y9.r("Showing native ads overlay.");
                        ((InterfaceC0308Md) obj).L().setVisibility(0);
                        this.f6487p.c.f11278t = true;
                        return;
                    default:
                        Y9.r("Hiding native ads overlay.");
                        ((InterfaceC0308Md) obj).L().setVisibility(8);
                        this.f6487p.c.f11278t = false;
                        return;
                }
            }
        });
        WeakReference weakReference = new WeakReference(a4);
        final int i6 = 2;
        InterfaceC0597f8 interfaceC0597f8 = new InterfaceC0597f8(this) { // from class: com.google.android.gms.internal.ads.Oi

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ Pi f6487p;

            {
                this.f6487p = this;
            }

            @Override // com.google.android.gms.internal.ads.InterfaceC0597f8
            public final void h(Object obj, Map map) {
                switch (i6) {
                    case 0:
                        this.f6487p.f6594b.b(map);
                        return;
                    case 1:
                        this.f6487p.d.y();
                        return;
                    case 2:
                        InterfaceC0308Md interfaceC0308Md = (InterfaceC0308Md) obj;
                        interfaceC0308Md.H().f8147u = new C1510e1((Object) this.f6487p, (Object) map, 24, false);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (TextUtils.isEmpty(str2)) {
                            interfaceC0308Md.loadData(str, "text/html", "UTF-8");
                            return;
                        } else {
                            interfaceC0308Md.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                            return;
                        }
                    case 3:
                        Y9.r("Showing native ads overlay.");
                        ((InterfaceC0308Md) obj).L().setVisibility(0);
                        this.f6487p.c.f11278t = true;
                        return;
                    default:
                        Y9.r("Hiding native ads overlay.");
                        ((InterfaceC0308Md) obj).L().setVisibility(8);
                        this.f6487p.c.f11278t = false;
                        return;
                }
            }
        };
        Aj aj = this.f6594b;
        aj.c("/loadHtml", new C1471zj(aj, weakReference, "/loadHtml", interfaceC0597f8));
        final int i7 = 3;
        aj.c("/showOverlay", new C1471zj(aj, new WeakReference(a4), "/showOverlay", new InterfaceC0597f8(this) { // from class: com.google.android.gms.internal.ads.Oi

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ Pi f6487p;

            {
                this.f6487p = this;
            }

            @Override // com.google.android.gms.internal.ads.InterfaceC0597f8
            public final void h(Object obj, Map map) {
                switch (i7) {
                    case 0:
                        this.f6487p.f6594b.b(map);
                        return;
                    case 1:
                        this.f6487p.d.y();
                        return;
                    case 2:
                        InterfaceC0308Md interfaceC0308Md = (InterfaceC0308Md) obj;
                        interfaceC0308Md.H().f8147u = new C1510e1((Object) this.f6487p, (Object) map, 24, false);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (TextUtils.isEmpty(str2)) {
                            interfaceC0308Md.loadData(str, "text/html", "UTF-8");
                            return;
                        } else {
                            interfaceC0308Md.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                            return;
                        }
                    case 3:
                        Y9.r("Showing native ads overlay.");
                        ((InterfaceC0308Md) obj).L().setVisibility(0);
                        this.f6487p.c.f11278t = true;
                        return;
                    default:
                        Y9.r("Hiding native ads overlay.");
                        ((InterfaceC0308Md) obj).L().setVisibility(8);
                        this.f6487p.c.f11278t = false;
                        return;
                }
            }
        }));
        final int i8 = 4;
        aj.c("/hideOverlay", new C1471zj(aj, new WeakReference(a4), "/hideOverlay", new InterfaceC0597f8(this) { // from class: com.google.android.gms.internal.ads.Oi

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ Pi f6487p;

            {
                this.f6487p = this;
            }

            @Override // com.google.android.gms.internal.ads.InterfaceC0597f8
            public final void h(Object obj, Map map) {
                switch (i8) {
                    case 0:
                        this.f6487p.f6594b.b(map);
                        return;
                    case 1:
                        this.f6487p.d.y();
                        return;
                    case 2:
                        InterfaceC0308Md interfaceC0308Md = (InterfaceC0308Md) obj;
                        interfaceC0308Md.H().f8147u = new C1510e1((Object) this.f6487p, (Object) map, 24, false);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (TextUtils.isEmpty(str2)) {
                            interfaceC0308Md.loadData(str, "text/html", "UTF-8");
                            return;
                        } else {
                            interfaceC0308Md.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                            return;
                        }
                    case 3:
                        Y9.r("Showing native ads overlay.");
                        ((InterfaceC0308Md) obj).L().setVisibility(0);
                        this.f6487p.c.f11278t = true;
                        return;
                    default:
                        Y9.r("Hiding native ads overlay.");
                        ((InterfaceC0308Md) obj).L().setVisibility(8);
                        this.f6487p.c.f11278t = false;
                        return;
                }
            }
        }));
        return a4;
    }
}
