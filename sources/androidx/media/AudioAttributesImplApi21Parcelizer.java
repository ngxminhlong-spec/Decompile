package androidx.media;

import android.media.AudioAttributes;
import m0.AbstractC1804a;
import m0.b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(AbstractC1804a abstractC1804a) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f2997a = (AudioAttributes) abstractC1804a.g(audioAttributesImplApi21.f2997a, 1);
        audioAttributesImplApi21.f2998b = abstractC1804a.f(audioAttributesImplApi21.f2998b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, AbstractC1804a abstractC1804a) {
        abstractC1804a.getClass();
        AudioAttributes audioAttributes = audioAttributesImplApi21.f2997a;
        abstractC1804a.i(1);
        ((b) abstractC1804a).f13977e.writeParcelable(audioAttributes, 0);
        abstractC1804a.j(audioAttributesImplApi21.f2998b, 2);
    }
}
