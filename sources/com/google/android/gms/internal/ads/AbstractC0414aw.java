package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.aw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0414aw implements InterfaceC0583ev {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f8179a;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f8179a = Collections.unmodifiableSet(hashSet);
    }
}
