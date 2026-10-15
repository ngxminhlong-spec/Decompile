package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class Vr {

    /* renamed from: g, reason: collision with root package name */
    public static final String f7301g = new UUID(0, 0).toString();

    /* renamed from: a, reason: collision with root package name */
    public final String f7302a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7303b;
    public final String c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f7304e;

    /* renamed from: f, reason: collision with root package name */
    public final C0258Da f7305f;

    public Vr(Context context, String str, String str2, String str3) {
        if (C0258Da.f4616s == null) {
            C0258Da.f4616s = new C0258Da(context);
        }
        this.f7305f = C0258Da.f4616s;
        this.f7302a = str;
        this.f7303b = str.concat("_3p");
        this.c = str2;
        this.d = str2.concat("_3p");
        this.f7304e = str3;
    }

    public final N1.d a(long j4, String str, String str2, boolean z4) {
        String str3 = this.f7303b;
        C0258Da c0258Da = this.f7305f;
        if (str != null) {
            try {
                UUID.fromString(str);
                if (!str.equals(f7301g)) {
                    String string = ((SharedPreferences) c0258Da.f4619q).getString(str3, null);
                    String string2 = ((SharedPreferences) c0258Da.f4619q).getString("paid_3p_hash_key", null);
                    if (string != null && string2 != null && !string.equals(e(str, str2, string2))) {
                        return b(str, str2);
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            return new N1.d(7);
        }
        boolean z5 = str != null;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis < 0) {
            throw new IllegalStateException(this.f7304e.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        String str4 = this.c;
        String str5 = this.d;
        long j5 = ((SharedPreferences) c0258Da.f4619q).getLong(z5 ? str5 : str4, -1L);
        if (j5 != -1) {
            if (currentTimeMillis < j5) {
                c0258Da.s(Long.valueOf(currentTimeMillis), z5 ? str5 : str4);
            } else if (currentTimeMillis >= j5 + j4) {
                return b(str, str2);
            }
        }
        if (!z5) {
            str3 = this.f7302a;
        }
        String string3 = ((SharedPreferences) c0258Da.f4619q).getString(str3, null);
        if (string3 == null && !z4) {
            return b(str, str2);
        }
        if (z5) {
            str4 = str5;
        }
        return new N1.d(string3, ((SharedPreferences) c0258Da.f4619q).getLong(str4, -1L), 7);
    }

    public final N1.d b(String str, String str2) {
        if (str == null) {
            return c(UUID.randomUUID().toString(), false);
        }
        String uuid = UUID.randomUUID().toString();
        this.f7305f.s(uuid, "paid_3p_hash_key");
        return c(e(str, str2, uuid), true);
    }

    public final N1.d c(String str, boolean z4) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis < 0) {
            throw new IllegalStateException(this.f7304e.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        String str2 = z4 ? this.d : this.c;
        Long valueOf = Long.valueOf(currentTimeMillis);
        C0258Da c0258Da = this.f7305f;
        c0258Da.s(valueOf, str2);
        c0258Da.s(str, z4 ? this.f7303b : this.f7302a);
        return new N1.d(str, currentTimeMillis, 7);
    }

    public final void d(boolean z4) {
        String str = z4 ? this.d : this.c;
        C0258Da c0258Da = this.f7305f;
        c0258Da.t(str);
        c0258Da.t(z4 ? this.f7303b : this.f7302a);
    }

    public final String e(String str, String str2, String str3) {
        if (str2 != null) {
            return UUID.nameUUIDFromBytes(n0.a.i(str, str2, str3).getBytes(StandardCharsets.UTF_8)).toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7304e);
        sb.append(": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ");
        sb.append(str2 == null ? "null" : "not null");
        sb.append(", hashKey is ");
        sb.append("not null");
        throw new IllegalArgumentException(sb.toString());
    }
}
