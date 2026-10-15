package com.google.android.gms.internal.ads;

import O1.C0101z0;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.tn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1217tn extends AbstractBinderC1149s4 implements X9 {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f10737s = 0;

    /* renamed from: o, reason: collision with root package name */
    public final C0272Fc f10738o;

    /* renamed from: p, reason: collision with root package name */
    public final JSONObject f10739p;

    /* renamed from: q, reason: collision with root package name */
    public final long f10740q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f10741r;

    public BinderC1217tn(String str, V9 v9, C0272Fc c0272Fc, long j4) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
        JSONObject jSONObject = new JSONObject();
        this.f10739p = jSONObject;
        this.f10741r = false;
        this.f10738o = c0272Fc;
        this.f10740q = j4;
        try {
            jSONObject.put("adapter_version", v9.d().toString());
            jSONObject.put("sdk_version", v9.h().toString());
            jSONObject.put("name", str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 == 1) {
            String readString = parcel.readString();
            AbstractC1192t4.b(parcel);
            K3(readString);
        } else if (i4 == 2) {
            String readString2 = parcel.readString();
            AbstractC1192t4.b(parcel);
            L3(readString2);
        } else {
            if (i4 != 3) {
                return false;
            }
            C0101z0 c0101z0 = (C0101z0) AbstractC1192t4.a(parcel, C0101z0.CREATOR);
            AbstractC1192t4.b(parcel);
            synchronized (this) {
                M3(c0101z0.f1406p, 2);
            }
        }
        parcel2.writeNoException();
        return true;
    }

    public final synchronized void K3(String str) {
        if (this.f10741r) {
            return;
        }
        if (str == null) {
            L3("Adapter returned null signals");
            return;
        }
        try {
            this.f10739p.put("signals", str);
            C0937n6 c0937n6 = AbstractC1066q6.f10264o1;
            O1.r rVar = O1.r.d;
            if (((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
                JSONObject jSONObject = this.f10739p;
                N1.n.f1204A.f1212j.getClass();
                jSONObject.put("latency", SystemClock.elapsedRealtime() - this.f10740q);
            }
            if (((Boolean) rVar.c.a(AbstractC1066q6.f10259n1)).booleanValue()) {
                this.f10739p.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.f10738o.b(this.f10739p);
        this.f10741r = true;
    }

    public final synchronized void L3(String str) {
        M3(str, 2);
    }

    public final synchronized void M3(String str, int i4) {
        try {
            if (this.f10741r) {
                return;
            }
            try {
                this.f10739p.put("signal_error", str);
                C0937n6 c0937n6 = AbstractC1066q6.f10264o1;
                O1.r rVar = O1.r.d;
                if (((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
                    JSONObject jSONObject = this.f10739p;
                    N1.n.f1204A.f1212j.getClass();
                    jSONObject.put("latency", SystemClock.elapsedRealtime() - this.f10740q);
                }
                if (((Boolean) rVar.c.a(AbstractC1066q6.f10259n1)).booleanValue()) {
                    this.f10739p.put("signal_error_code", i4);
                }
            } catch (JSONException unused) {
            }
            this.f10738o.b(this.f10739p);
            this.f10741r = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void i() {
        if (this.f10741r) {
            return;
        }
        try {
            if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10259n1)).booleanValue()) {
                this.f10739p.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.f10738o.b(this.f10739p);
        this.f10741r = true;
    }
}
