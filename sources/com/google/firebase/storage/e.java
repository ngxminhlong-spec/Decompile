package com.google.firebase.storage;

import android.net.Uri;
import com.google.android.gms.internal.measurement.C1510e1;
import h2.y;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class e implements Comparable {

    /* renamed from: o, reason: collision with root package name */
    public final Uri f12555o;

    /* renamed from: p, reason: collision with root package name */
    public final b f12556p;

    public e(Uri uri, b bVar) {
        y.a("storageUri cannot be null", uri != null);
        y.a("FirebaseApp cannot be null", bVar != null);
        this.f12555o = uri;
        this.f12556p = bVar;
    }

    public final C1510e1 a() {
        this.f12556p.getClass();
        return new C1510e1(this.f12555o);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f12555o.compareTo(((e) obj).f12555o);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return ((e) obj).toString().equals(toString());
        }
        return false;
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("gs://");
        Uri uri = this.f12555o;
        sb.append(uri.getAuthority());
        sb.append(uri.getEncodedPath());
        return sb.toString();
    }
}
