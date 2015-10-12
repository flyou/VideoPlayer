import com.sina.sinavideo.sdk.utils.VDApplication;
import com.sina.sinavideo.sdk.utils.VDResolutionManager;

/**
 * Created by Administrator on 2015/10/11.
 */
public class Application extends android.app.Application {
    @Override
    public void onCreate() {

        super.onCreate();

        // 播放器初始化，要在app启动前进行初始化，才能解压出相应的解码器
        VDApplication.getInstance().initPlayer(this);
        VDResolutionManager.getInstance(this).init(
                VDResolutionManager.RESOLUTION_SOLUTION_NONE);
    }
}
