package androidx.media;

import m0.AbstractC1804a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(AbstractC1804a abstractC1804a) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f2999a = abstractC1804a.f(audioAttributesImplBase.f2999a, 1);
        audioAttributesImplBase.f3000b = abstractC1804a.f(audioAttributesImplBase.f3000b, 2);
        audioAttributesImplBase.c = abstractC1804a.f(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = abstractC1804a.f(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, AbstractC1804a abstractC1804a) {
        abstractC1804a.getClass();
        abstractC1804a.j(audioAttributesImplBase.f2999a, 1);
        abstractC1804a.j(audioAttributesImplBase.f3000b, 2);
        abstractC1804a.j(audioAttributesImplBase.c, 3);
        abstractC1804a.j(audioAttributesImplBase.d, 4);
    }
}
