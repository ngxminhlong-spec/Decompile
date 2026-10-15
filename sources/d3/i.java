package d3;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.Qw;
import com.google.android.gms.internal.ads.Wl;
import h2.y;
import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f12629a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12630b;
    public final String c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f12631e;

    /* renamed from: f, reason: collision with root package name */
    public final String f12632f;

    /* renamed from: g, reason: collision with root package name */
    public final String f12633g;

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i4 = l2.c.f13966a;
        y.k("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.f12630b = str;
        this.f12629a = str2;
        this.c = str3;
        this.d = str4;
        this.f12631e = str5;
        this.f12632f = str6;
        this.f12633g = str7;
    }

    public static i a(Context context) {
        Wl wl = new Wl(context);
        String c = wl.c("google_app_id");
        if (TextUtils.isEmpty(c)) {
            return null;
        }
        return new i(c, wl.c("google_api_key"), wl.c("firebase_database_url"), wl.c("ga_trackingId"), wl.c("gcm_defaultSenderId"), wl.c("google_storage_bucket"), wl.c("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return y.m(this.f12630b, iVar.f12630b) && y.m(this.f12629a, iVar.f12629a) && y.m(this.c, iVar.c) && y.m(this.d, iVar.d) && y.m(this.f12631e, iVar.f12631e) && y.m(this.f12632f, iVar.f12632f) && y.m(this.f12633g, iVar.f12633g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12630b, this.f12629a, this.c, this.d, this.f12631e, this.f12632f, this.f12633g});
    }

    public final String toString() {
        Qw qw = new Qw(this);
        qw.s(this.f12630b, "applicationId");
        qw.s(this.f12629a, "apiKey");
        qw.s(this.c, "databaseUrl");
        qw.s(this.f12631e, "gcmSenderId");
        qw.s(this.f12632f, "storageBucket");
        qw.s(this.f12633g, "projectId");
        return qw.toString();
    }
}
