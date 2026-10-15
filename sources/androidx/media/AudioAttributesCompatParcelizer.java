package androidx.media;

import m0.AbstractC1804a;
import m0.c;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(AbstractC1804a abstractC1804a) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        c cVar = audioAttributesCompat.f2996a;
        if (abstractC1804a.e(1)) {
            cVar = abstractC1804a.h();
        }
        audioAttributesCompat.f2996a = (AudioAttributesImpl) cVar;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, AbstractC1804a abstractC1804a) {
        abstractC1804a.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f2996a;
        abstractC1804a.i(1);
        abstractC1804a.k(audioAttributesImpl);
    }
}
