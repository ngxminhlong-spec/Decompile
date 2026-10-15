package e1;

import B0.u;
import D0.o;
import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.os.VibrationEffect;
import android.os.Vibrator;
import com.duracodefactory.logiccircuitsimulatorpro.view.BoardView;
import java.util.HashSet;
import s1.C1971a;
import s1.C1972b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public Context f12708a;

    /* renamed from: b, reason: collision with root package name */
    public Vibrator f12709b;
    public CameraManager c;
    public u d;

    /* renamed from: e, reason: collision with root package name */
    public String f12710e;

    /* renamed from: f, reason: collision with root package name */
    public HashSet f12711f;

    /* renamed from: g, reason: collision with root package name */
    public HashSet f12712g;

    /* renamed from: h, reason: collision with root package name */
    public long[] f12713h;

    /* renamed from: i, reason: collision with root package name */
    public C1971a f12714i;

    /* renamed from: j, reason: collision with root package name */
    public Handler f12715j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f12716k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f12717l;

    /* renamed from: m, reason: collision with root package name */
    public o f12718m;

    public final void a() {
        CameraManager cameraManager = this.c;
        if (cameraManager == null) {
            return;
        }
        try {
            if (this.f12716k) {
                return;
            }
            cameraManager.setTorchMode(this.f12710e, true);
            this.f12716k = true;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void b() {
        VibrationEffect createWaveform;
        Vibrator vibrator = this.f12709b;
        if (vibrator == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            createWaveform = VibrationEffect.createWaveform(this.f12713h, 0);
            this.f12709b.vibrate(createWaveform);
        } else {
            vibrator.vibrate(this.f12713h, 0);
        }
        BoardView boardView = this.f12714i.f14763a;
        C1972b c1972b = boardView.f3818b0;
        if (true != c1972b.f12955a) {
            c1972b.f12955a = true;
            boardView.f3807M.a(c1972b);
        }
    }

    public final void c() {
        CameraManager cameraManager = this.c;
        if (cameraManager == null) {
            return;
        }
        try {
            if (this.f12716k) {
                cameraManager.setTorchMode(this.f12710e, false);
                this.f12716k = false;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void d(String str, boolean z4) {
        HashSet hashSet = this.f12711f;
        if (z4) {
            hashSet.add(str);
        } else {
            hashSet.remove(str);
        }
        if (z4 || !hashSet.isEmpty()) {
            if (z4 && hashSet.size() == 1) {
                b();
                return;
            }
            return;
        }
        Vibrator vibrator = this.f12709b;
        if (vibrator == null) {
            return;
        }
        vibrator.cancel();
        C1972b c1972b = this.f12714i.f14763a.f3818b0;
        if (c1972b.f12955a) {
            c1972b.f12955a = false;
        }
    }
}
