package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.bo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0449bo implements Fo {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8284a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8285b;
    public final Object c;

    public /* synthetic */ C0449bo(int i4, Object obj, Object obj2) {
        this.f8284a = i4;
        this.f8285b = obj;
        this.c = obj2;
    }

    private final void b(Object obj) {
        int i4;
        String str;
        JSONArray optJSONArray;
        Un un = (Un) this.f8285b;
        ArrayList<String> arrayList = (ArrayList) this.c;
        Bundle bundle = (Bundle) obj;
        bundle.putInt("native_version", 3);
        bundle.putStringArrayList("native_templates", arrayList);
        bundle.putStringArrayList("native_custom_templates", ((Jp) un.c).f5913h);
        if (((Jp) un.c).f5914i.f9125o > 3) {
            bundle.putBoolean("enable_native_media_orientation", true);
            int i5 = ((Jp) un.c).f5914i.f9132v;
            String str2 = i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? "unknown" : "square" : "portrait" : "landscape" : "any";
            if (!"unknown".equals(str2)) {
                bundle.putString("native_media_orientation", str2);
            }
        }
        int i6 = ((Jp) un.c).f5914i.f9127q;
        String str3 = i6 != 0 ? i6 != 1 ? i6 != 2 ? "unknown" : "landscape" : "portrait" : "any";
        if (!"unknown".equals(str3)) {
            bundle.putString("native_image_orientation", str3);
        }
        bundle.putBoolean("native_multiple_images", ((Jp) un.c).f5914i.f9128r);
        bundle.putBoolean("use_custom_mute", ((Jp) un.c).f5914i.f9131u);
        C0766j7 c0766j7 = ((Jp) un.c).f5914i;
        if (c0766j7.f9133w != 0) {
            bundle.putBoolean("sccg_tap", c0766j7.f9134x);
            bundle.putInt("sccg_dir", ((Jp) un.c).f5914i.f9133w);
        }
        PackageInfo packageInfo = (PackageInfo) un.d;
        int i7 = packageInfo == null ? 0 : packageInfo.versionCode;
        Q1.K k3 = (Q1.K) un.f7185e;
        k3.r();
        synchronized (k3.f1642a) {
            i4 = k3.f1659t;
        }
        if (i7 > i4) {
            ((Q1.K) un.f7185e).F();
            ((Q1.K) un.f7185e).G(i7);
        }
        JSONObject D4 = ((Q1.K) un.f7185e).D();
        String str4 = null;
        if (D4 != null && (optJSONArray = D4.optJSONArray(((Jp) un.c).f5911f)) != null) {
            str4 = optJSONArray.toString();
        }
        if (!TextUtils.isEmpty(str4)) {
            bundle.putString("native_advanced_settings", str4);
        }
        int i8 = ((Jp) un.c).f5916k;
        if (i8 > 1) {
            bundle.putInt("max_num_ads", i8);
        }
        C8 c8 = ((Jp) un.c).f5909b;
        if (c8 != null) {
            if (TextUtils.isEmpty(c8.f4405q)) {
                if (c8.f4403o >= 2) {
                    int i9 = c8.f4406r;
                    str = i9 != 2 ? i9 != 3 ? "l" : "p" : "l";
                } else {
                    int i10 = c8.f4404p;
                    if (i10 != 1) {
                        if (i10 != 2) {
                            Y9.p("Instream ad video aspect ratio " + i10 + " is wrong.");
                        } else {
                            str = "p";
                        }
                    }
                    str = "l";
                }
                bundle.putString("ia_var", str);
            } else {
                bundle.putString("ad_tag", c8.f4405q);
            }
            bundle.putBoolean("instr", true);
        }
        if (((Jp) un.c).a() != null) {
            bundle.putBoolean("has_delayed_banner_listener", true);
        }
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.Y9)).booleanValue()) {
            if (((Jp) un.c).f5914i.f9130t != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("startMuted", ((Jp) un.c).f5914i.f9130t.f1287o);
                bundle2.putBoolean("clickToExpandRequested", ((Jp) un.c).f5914i.f9130t.f1289q);
                bundle2.putBoolean("customControlsRequested", ((Jp) un.c).f5914i.f9130t.f1288p);
                bundle.putBundle("video", bundle2);
            }
            bundle.putBoolean("disable_image_loading", ((Jp) un.c).f5914i.f9126p);
            bundle.putInt("preferred_ad_choices_position", ((Jp) un.c).f5914i.f9129s);
        }
    }

    @Override // com.google.android.gms.internal.ads.Fo
    public final void a(Object obj) {
        switch (this.f8284a) {
            case 0:
                C0491co c0491co = (C0491co) this.f8285b;
                Bundle bundle = (Bundle) this.c;
                Bundle bundle2 = (Bundle) obj;
                C0937n6 c0937n6 = AbstractC1066q6.M4;
                O1.r rVar = O1.r.d;
                if (((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
                    bundle2.putBundle("quality_signals", bundle);
                } else {
                    if (((Boolean) rVar.c.a(AbstractC1066q6.L4)).booleanValue()) {
                        synchronized (C0491co.f8407k) {
                            ((C0910mg) c0491co.f8411f).l(c0491co.c.d);
                            bundle2.putBundle("quality_signals", ((Rp) c0491co.f8412g).a());
                        }
                    } else {
                        ((C0910mg) c0491co.f8411f).l(c0491co.c.d);
                        bundle2.putBundle("quality_signals", ((Rp) c0491co.f8412g).a());
                    }
                }
                bundle2.putString("seq_num", c0491co.d);
                if (!((Q1.K) c0491co.f8413h).q()) {
                    bundle2.putString("session_id", (String) c0491co.f8410e);
                }
                bundle2.putBoolean("client_purpose_one", !((Q1.K) c0491co.f8413h).q());
                if (((Boolean) rVar.c.a(AbstractC1066q6.N4)).booleanValue()) {
                    try {
                        Q1.N n4 = N1.n.f1204A.c;
                        bundle2.putString("_app_id", Q1.N.C(c0491co.f8409b));
                    } catch (RemoteException e4) {
                        N1.n.f1204A.f1209g.h("AppStatsSignal_AppId", e4);
                    }
                }
                C0937n6 c0937n62 = AbstractC1066q6.O4;
                O1.r rVar2 = O1.r.d;
                if (((Boolean) rVar2.c.a(c0937n62)).booleanValue() && c0491co.c.f5911f != null) {
                    Bundle bundle3 = new Bundle();
                    Long l4 = (Long) ((C1082qg) c0491co.f8415j).d.get(c0491co.c.f5911f);
                    bundle3.putLong("dload", l4 == null ? -1L : l4.longValue());
                    Integer num = (Integer) ((C1082qg) c0491co.f8415j).f10376b.get(c0491co.c.f5911f);
                    bundle3.putInt("pcc", num == null ? 0 : num.intValue());
                    bundle2.putBundle("ad_unit_quality_signals", bundle3);
                }
                if (((Boolean) rVar2.c.a(AbstractC1066q6.A8)).booleanValue()) {
                    N1.n nVar = N1.n.f1204A;
                    if (nVar.f1209g.f9976k.get() > 0) {
                        bundle2.putInt("nrwv", nVar.f1209g.f9976k.get());
                        return;
                    }
                    return;
                }
                return;
            case 1:
                JSONObject jSONObject = (JSONObject) this.f8285b;
                Bundle bundle4 = (Bundle) obj;
                if (jSONObject != null) {
                    bundle4.putString("fwd_cld", jSONObject.toString());
                }
                JSONObject jSONObject2 = (JSONObject) this.c;
                if (jSONObject2 != null) {
                    bundle4.putString("fwd_common_cld", jSONObject2.toString());
                    return;
                }
                return;
            case 2:
                b(obj);
                return;
            default:
                Bundle bundle5 = (Bundle) obj;
                bundle5.putString("rtb", (String) this.f8285b);
                Bundle bundle6 = (Bundle) this.c;
                if (bundle6.isEmpty()) {
                    return;
                }
                bundle5.putBundle("adapter_initialization_status", bundle6);
                return;
        }
    }
}
