package androidx.media;

import android.util.SparseIntArray;
import m0.c;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class AudioAttributesCompat implements c {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f2995b = 0;

    /* renamed from: a, reason: collision with root package name */
    public AudioAttributesImpl f2996a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f2996a;
        return audioAttributesImpl == null ? audioAttributesCompat.f2996a == null : audioAttributesImpl.equals(audioAttributesCompat.f2996a);
    }

    public final int hashCode() {
        return this.f2996a.hashCode();
    }

    public final String toString() {
        return this.f2996a.toString();
    }
}
