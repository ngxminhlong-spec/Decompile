package e1;

import D0.o;
import android.content.Context;
import android.media.MediaRecorder;
import android.os.Handler;
import com.duracodefactory.logiccircuitsimulatorpro.view.BoardView;
import java.util.ArrayList;
import s1.C1972b;
import s1.C1973c;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public Context f12732a;

    /* renamed from: b, reason: collision with root package name */
    public MediaRecorder f12733b;
    public boolean c;
    public q2.e d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f12734e;

    /* renamed from: f, reason: collision with root package name */
    public float f12735f;

    /* renamed from: g, reason: collision with root package name */
    public Handler f12736g;

    /* renamed from: h, reason: collision with root package name */
    public C1973c f12737h;

    /* renamed from: i, reason: collision with root package name */
    public o f12738i;

    public final void a() {
        MediaRecorder mediaRecorder = this.f12733b;
        if (mediaRecorder == null) {
            return;
        }
        try {
            mediaRecorder.setAudioSource(1);
            this.f12733b.setOutputFormat(0);
            this.f12733b.setAudioEncoder(0);
            this.f12733b.setOutputFile(this.f12732a.getFilesDir() + "/temp_mic_rec");
            this.f12733b.prepare();
            this.f12733b.start();
            this.c = true;
            this.f12736g.postDelayed(this.f12738i, 64L);
            BoardView boardView = this.f12737h.f14765a;
            C1972b c1972b = boardView.f3820d0;
            if (true != c1972b.f12955a) {
                c1972b.f12955a = true;
                boardView.f3807M.a(c1972b);
                boardView.f3798D.e();
            }
        } catch (Throwable unused) {
            this.f12737h.f14765a.f3798D.e();
        }
    }

    public final void b() {
        try {
            MediaRecorder mediaRecorder = this.f12733b;
            if (mediaRecorder != null && this.c) {
                this.c = false;
                mediaRecorder.stop();
                this.f12733b.reset();
                this.f12736g.removeCallbacks(this.f12738i);
                C1972b c1972b = this.f12737h.f14765a.f3820d0;
                if (c1972b.f12955a) {
                    c1972b.f12955a = false;
                }
            }
        } catch (Throwable unused) {
        }
    }
}
