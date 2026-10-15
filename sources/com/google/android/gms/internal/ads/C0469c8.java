package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.c8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0469c8 implements InterfaceC0597f8 {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f8347o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f8348p;

    /* renamed from: q, reason: collision with root package name */
    public final Object f8349q;

    public C0469c8() {
        this.f8347o = 1;
        this.f8348p = new Object();
        this.f8349q = new HashMap();
    }

    public /* synthetic */ C0469c8(int i4, Object obj, Object obj2) {
        this.f8347o = i4;
        this.f8348p = obj;
        this.f8349q = obj2;
    }

    private final void a(Object obj, Map map) {
        Nj nj = (Nj) this.f8348p;
        C0348Ud c0348Ud = (C0348Ud) this.f8349q;
        C1209tf c1209tf = nj.f6361i;
        synchronized (c1209tf) {
            c1209tf.f10703q.add(c0348Ud);
            C1038pf c1038pf = c1209tf.f10701o;
            c0348Ud.A0("/updateActiveView", c1038pf.f9995e);
            c0348Ud.A0("/untrackActiveViewUnit", c1038pf.f9996f);
        }
    }

    public void b(String str, InterfaceC0939n8 interfaceC0939n8) {
        synchronized (this.f8348p) {
            ((HashMap) this.f8349q).put(str, interfaceC0939n8);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0597f8
    public final void h(Object obj, Map map) {
        InterfaceC0939n8 interfaceC0939n8;
        switch (this.f8347o) {
            case 0:
                InterfaceC0308Md interfaceC0308Md = (InterfaceC0308Md) obj;
                AbstractC0554e8.b(map, (Sh) this.f8348p);
                String str = (String) map.get("u");
                if (str == null) {
                    Y9.s("URL missing from click GMSG.");
                    return;
                }
                C0567ef c0567ef = (C0567ef) this.f8349q;
                Ku q4 = Ku.q(AbstractC0554e8.a(interfaceC0308Md, str));
                C0512d8 c0512d8 = new C0512d8(0, c0567ef);
                C0260Dc c0260Dc = AbstractC0266Ec.f4897a;
                C1267uu n02 = Bs.n0(q4, c0512d8, c0260Dc);
                n02.a(new Nu(0, n02, new M3(10, interfaceC0308Md)), c0260Dc);
                return;
            case 1:
                String str2 = (String) map.get("id");
                String str3 = (String) map.get("fail");
                String str4 = (String) map.get("fail_reason");
                String str5 = (String) map.get("fail_stack");
                String str6 = (String) map.get("result");
                if (true == TextUtils.isEmpty(str5)) {
                    str4 = "Unknown Fail Reason.";
                }
                String concat = TextUtils.isEmpty(str5) ? "" : "\n".concat(String.valueOf(str5));
                synchronized (this.f8348p) {
                    try {
                        interfaceC0939n8 = (InterfaceC0939n8) ((HashMap) this.f8349q).remove(str2);
                    } catch (JSONException e4) {
                        interfaceC0939n8.o(e4.getMessage());
                    } finally {
                    }
                    if (interfaceC0939n8 == null) {
                        Y9.s("Received result for unexpected method invocation: " + str2);
                        return;
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        interfaceC0939n8.o(str4 + concat);
                        return;
                    }
                    if (str6 == null) {
                        interfaceC0939n8.p(null);
                        return;
                    }
                    JSONObject jSONObject = new JSONObject(str6);
                    if (Q1.I.y()) {
                        Q1.I.w("Result GMSG: " + jSONObject.toString(2));
                    }
                    interfaceC0939n8.p(jSONObject);
                    return;
                }
            case 2:
                Mi mi = (Mi) this.f8348p;
                try {
                    mi.f6263t = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    Y9.p("Failed to call parse unconfirmedClickTimestamp.");
                }
                R7 r7 = (R7) this.f8349q;
                mi.f6262s = (String) map.get("id");
                String str7 = (String) map.get("asset_id");
                if (r7 == null) {
                    Y9.m("Received unconfirmed click but UnconfirmedClickListener is null.");
                    return;
                }
                try {
                    Parcel Q3 = r7.Q();
                    Q3.writeString(str7);
                    r7.G1(Q3, 1);
                    return;
                } catch (RemoteException e5) {
                    Y9.u("#007 Could not call remote method.", e5);
                    return;
                }
            case 3:
                a(obj, map);
                return;
            default:
                InterfaceC0308Md interfaceC0308Md2 = (InterfaceC0308Md) obj;
                String str8 = (String) map.get("u");
                if (str8 == null) {
                    Y9.s("URL missing from httpTrack GMSG.");
                    return;
                } else {
                    if (!interfaceC0308Md2.x().f11515i0) {
                        ((Oq) this.f8348p).a(str8, null);
                        return;
                    }
                    Xl xl = (Xl) this.f8349q;
                    N1.n.f1204A.f1212j.getClass();
                    xl.b(new N2(System.currentTimeMillis(), interfaceC0308Md2.W().f3998b, str8, 2));
                    return;
                }
        }
    }
}
