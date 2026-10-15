package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.C1510e1;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Ca, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0252Ca extends AbstractBinderC1149s4 implements InterfaceC0522dc {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1510e1 f4442o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC0252Ca(C1510e1 c1510e1) {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
        this.f4442o = c1510e1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0522dc
    public final void B(String str) {
        this.f4442o.p(str);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 == 1) {
            parcel.readString();
            parcel.readString();
            AbstractC1192t4.b(parcel);
        } else if (i4 == 2) {
            String readString = parcel.readString();
            AbstractC1192t4.b(parcel);
            B(readString);
        } else {
            if (i4 != 3) {
                return false;
            }
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            Bundle bundle = (Bundle) AbstractC1192t4.a(parcel, Bundle.CREATOR);
            AbstractC1192t4.b(parcel);
            L1(readString2, readString3, bundle);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0522dc
    public final void L1(String str, String str2, Bundle bundle) {
        String format;
        C1510e1 c1510e1 = this.f4442o;
        String str3 = (String) c1510e1.f11914p;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paw_id", str3);
            jSONObject.put("signal", str);
            format = String.format("window.postMessage(%1$s, '*');", jSONObject);
        } catch (JSONException unused) {
            format = String.format("window.postMessage({'paw_id': '%1$s', 'signal': '%2$s'}, '*');", str3, str);
        }
        ((W1.a) c1510e1.f11915q).f1944b.evaluateJavascript(format, null);
    }
}
