package F3;

import android.net.Uri;
import com.google.android.gms.internal.measurement.C1510e1;
import d3.g;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: l, reason: collision with root package name */
    public final Uri f751l;

    /* renamed from: m, reason: collision with root package name */
    public final byte[] f752m;

    /* renamed from: n, reason: collision with root package name */
    public final int f753n;

    public b(C1510e1 c1510e1, g gVar, Uri uri, byte[] bArr, long j4, int i4, boolean z4) {
        super(c1510e1, gVar);
        if (j4 < 0) {
            this.f744a = new IllegalArgumentException("offset cannot be negative");
        }
        this.f753n = i4;
        this.f751l = uri;
        this.f752m = i4 <= 0 ? null : bArr;
        m("X-Goog-Upload-Protocol", "resumable");
        if (z4 && i4 > 0) {
            m("X-Goog-Upload-Command", "upload, finalize");
        } else if (z4) {
            m("X-Goog-Upload-Command", "finalize");
        } else {
            m("X-Goog-Upload-Command", "upload");
        }
        m("X-Goog-Upload-Offset", Long.toString(j4));
    }

    @Override // F3.a
    public final byte[] d() {
        return this.f752m;
    }

    @Override // F3.a
    public final int e() {
        int i4 = this.f753n;
        if (i4 > 0) {
            return i4;
        }
        return 0;
    }

    @Override // F3.a
    public final Uri i() {
        return this.f751l;
    }
}
