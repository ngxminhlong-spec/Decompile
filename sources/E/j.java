package E;

import android.net.Uri;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f696a;

    /* renamed from: b, reason: collision with root package name */
    public final int f697b;
    public final int c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final String f698e;

    /* renamed from: f, reason: collision with root package name */
    public final int f699f;

    public j(Uri uri, int i4, int i5, boolean z4, int i6) {
        uri.getClass();
        this.f696a = uri;
        this.f697b = i4;
        this.c = i5;
        this.d = z4;
        this.f698e = null;
        this.f699f = i6;
    }

    public j(String str, String str2) {
        this.f696a = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.f697b = 0;
        this.c = 400;
        this.d = false;
        this.f698e = str2;
        this.f699f = 0;
    }
}
