package com.google.android.gms.ads.internal.client;

import O1.G0;
import O1.W;
import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.BinderC0983o9;
import com.google.android.gms.internal.ads.InterfaceC1069q9;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class LiteSdkInfo extends W {
    public LiteSdkInfo(Context context) {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // O1.X
    public InterfaceC1069q9 getAdapterCreator() {
        return new BinderC0983o9();
    }

    @Override // O1.X
    public G0 getLiteSdkVersion() {
        return new G0(ModuleDescriptor.MODULE_VERSION, 234310000, "22.6.0");
    }
}
