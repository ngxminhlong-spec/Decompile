package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class UC implements InterfaceC1132ro, InterfaceC0433bE {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f7150o;

    public /* synthetic */ UC(int i4) {
        this.f7150o = i4;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0433bE
    public boolean a() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0433bE
    public int b() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0433bE
    public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0433bE
    public boolean g(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1132ro
    /* renamed from: l */
    public void mo6l(Object obj) {
        switch (this.f7150o) {
            case 0:
                return;
            case 1:
                return;
            case 2:
                return;
            case 3:
                return;
            case 4:
                return;
            case 5:
                return;
            default:
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0433bE
    public MediaCodecInfo u(int i4) {
        return MediaCodecList.getCodecInfoAt(i4);
    }
}
