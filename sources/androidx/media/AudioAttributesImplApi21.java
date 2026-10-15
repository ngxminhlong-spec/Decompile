package androidx.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
@TargetApi(21)
/* loaded from: classes.dex */
class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    public AudioAttributes f2997a;

    /* renamed from: b, reason: collision with root package name */
    public int f2998b = -1;

    public final boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f2997a.equals(((AudioAttributesImplApi21) obj).f2997a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2997a.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f2997a;
    }
}
